package com.skula.robotory.services;

import java.nio.ByteOrder;

import com.skula.robotory.constants.Cnst;
import com.skula.robotory.constants.UIArea;
import com.skula.robotory.enums.Action;
import com.skula.robotory.enums.Item;
import com.skula.robotory.models.Matrix;

public class GameEngine {
	private int token;
	private Action action;
	private int srcArea;
	private int destArea;

	private Item board[];
	private int wSpawnleft;
	private int bSpawnleft;
	private Item p1Stock[];
	private Item p2Stock[];

	private boolean endRound;

	private String message;

	public GameEngine() {
		this.token = 0;
		this.board = new Item[Cnst.TILES_COUNT];
		for (int i = 0; i < Cnst.TILES_COUNT; i++) {
			this.board[i] = Item.NONE;
		}
		this.board[10] = Item.RED_ROBOT;
		this.board[13] = Item.WHITE_ROBOT;
		this.board[14] = Item.BLACK_ROBOT;

		// bouchon
		this.board[1] = Item.BLACK_SPAWN;
		this.board[2] = Item.WHITE_SPAWN;
		this.board[3] = Item.BLACK_SPAWN;
		this.board[4] = Item.WHITE_SPAWN;
		this.board[5] = Item.BLACK_SPAWN;
		this.board[23] = Item.WHITE_SPAWN;

		this.wSpawnleft = Cnst.SPAWNS_COUNT;
		this.bSpawnleft = Cnst.SPAWNS_COUNT;
		
		this.p1Stock = new Item[Cnst.STOCK_SLOTS_COUNT];
		this.p2Stock = new Item[Cnst.STOCK_SLOTS_COUNT];
		for (int i = 0; i < Cnst.STOCK_SLOTS_COUNT; i++) {
			p1Stock[i] = Item.WHITE_SPAWN;
			p2Stock[i] = Item.BLACK_SPAWN;
		}

		this.action = Action.NONE;
		this.srcArea = UIArea.AREA_NONE_ID;
		this.destArea = UIArea.AREA_NONE_ID;

		this.endRound = false;

		this.message = "";
	}

	public void nextPlayer() {
		this.action = Action.NONE;
		this.endRound = false;
		this.token = this.token == 0 ? 1 : 0;
	}

	public boolean canProcess() {
		switch (action) {
		case MOVE_ROBOT:
			if (!UIArea.isTile(destArea)) {
				return false;
			}
			// si on deselectionne le robot
			if (srcArea == destArea) {
				return true;
			}
			if (canMoveRobot(srcArea, destArea)) {
				return true;
			} else {
				return false;
			}
		case PUT_SPAWN:
			if (!UIArea.isTile(destArea)) {
				return false;
			}
			if (board[destArea].equals(Item.NONE)) {
				return true;
			} else {
				return false;
			}
		case PICK_SPAWN:
			if (UIArea.isStockBtn(srcArea, token)) {
				if (isStockFull(token)) {
					return false;
				}
				int tmp = 0;
				switch (srcArea) {
				case UIArea.AREA_PLAYER1_BUTTON_STOCK_WHITE_ID:
					tmp = wSpawnleft;
					break;
				case UIArea.AREA_PLAYER1_BUTTON_STOCK_BLACK_ID:
					tmp = bSpawnleft;
					break;
				case UIArea.AREA_PLAYER2_BUTTON_STOCK_WHITE_ID:
					tmp = wSpawnleft;
					break;
				case UIArea.AREA_PLAYER2_BUTTON_STOCK_BLACK_ID:
					tmp = bSpawnleft;
					break;
				}
				if (tmp > 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		case NONE:
			// Clique sur une zone vide
			if (srcArea == UIArea.AREA_NONE_ID) {
				return false;
			}
			// Clique sur une tuile
			if (UIArea.isTile(srcArea)) {
				if (isRobot(srcArea) && canMoveRobot(srcArea)) {
					return true;
				} else {
					return false;
				}
				// Clique sur un pion d'energie du stock d'un joueur
			} else if (UIArea.isPlayerStock(srcArea, token)) {
				Item sc = null;
				switch (srcArea) {
				case UIArea.AREA_PLAYER1_STOCK_1_ID:
					sc = p1Stock[0];
					break;
				case UIArea.AREA_PLAYER1_STOCK_2_ID:
					sc = p1Stock[1];
					break;
				case UIArea.AREA_PLAYER1_STOCK_3_ID:
					sc = p1Stock[2];
					break;
				case UIArea.AREA_PLAYER1_STOCK_4_ID:
					sc = p1Stock[3];
					break;
				case UIArea.AREA_PLAYER2_STOCK_1_ID:
					sc = p2Stock[0];
					break;
				case UIArea.AREA_PLAYER2_STOCK_2_ID:
					sc = p2Stock[1];
					break;
				case UIArea.AREA_PLAYER2_STOCK_3_ID:
					sc = p2Stock[2];
					break;
				case UIArea.AREA_PLAYER2_STOCK_4_ID:
					sc = p2Stock[3];
					break;
				default:
					break;
				}
				if (sc.equals(Item.NONE)) {
					return false;
				} else {
					return true;
				}
				// Clique sur les boutons pour remplir le stock
			} else if (UIArea.isStockBtn(srcArea, token)) {
				if (isStockFull(token)) {
					return false;
				}
				int tmp = 0;
				switch (srcArea) {
				case UIArea.AREA_PLAYER1_BUTTON_STOCK_WHITE_ID:
					tmp = wSpawnleft;
					break;
				case UIArea.AREA_PLAYER1_BUTTON_STOCK_BLACK_ID:
					tmp = bSpawnleft;
					break;
				case UIArea.AREA_PLAYER2_BUTTON_STOCK_WHITE_ID:
					tmp = wSpawnleft;
					break;
				case UIArea.AREA_PLAYER2_BUTTON_STOCK_BLACK_ID:
					tmp = bSpawnleft;
					break;
				}
				if (tmp > 0) {

					action = Action.PICK_SPAWN;
					return true;
				} else {
					return false;
				}
			}
			return false;
		default:
			break;
		}
		return true;
	}

	public void process() {
		switch (action) {
		case MOVE_ROBOT:
			// arret des deplacements du robot (clique sur lui mm)
			if (srcArea == destArea) {
				endRound = true;
				// deplacement du robot
			} else {
				moveRobot(srcArea, destArea);
				srcArea = destArea;
				destArea = UIArea.AREA_NONE_ID;
				if (!canMoveRobot(srcArea)) { // A CREER LA FONCTION
												// canMoveRobot(int tileId)
					endRound = true;
				}
			}
			break;
		case PUT_SPAWN:
			putSpawn(srcArea, destArea);
			endRound = true;
			break;
		case PICK_SPAWN:
			if (token == 0) {
				if (srcArea == UIArea.AREA_PLAYER1_BUTTON_STOCK_WHITE_ID) {
					addStock(0, Item.WHITE_SPAWN);
					srcArea = UIArea.AREA_NONE_ID;
				} else {
					addStock(0, Item.BLACK_SPAWN);
					srcArea = UIArea.AREA_NONE_ID;
				}
			} else {
				if (srcArea == UIArea.AREA_PLAYER2_BUTTON_STOCK_WHITE_ID) {
					addStock(1, Item.WHITE_SPAWN);
					srcArea = UIArea.AREA_NONE_ID;
				} else {
					addStock(1, Item.BLACK_SPAWN);
					srcArea = UIArea.AREA_NONE_ID;
				}
			}

			if (isStockEmpty() || isPlayerStockFull(token)) {
				endRound = true;
			}

			srcArea = UIArea.AREA_NONE_ID;
			destArea = UIArea.AREA_NONE_ID;
			break;
		case NONE:
			if (UIArea.isTile(srcArea)) {
				action = Action.MOVE_ROBOT;
			} else if (UIArea.isPlayerStock(srcArea, token)) {
				if (destArea == UIArea.AREA_NONE_ID) {
					action = Action.PUT_SPAWN;
				} else {
					endRound = true;
				}
			} else if (UIArea.isStockBtn(srcArea, token)) {
				if (token == 0) {
					if (srcArea == UIArea.AREA_PLAYER1_BUTTON_STOCK_WHITE_ID) {
						addStock(0, Item.WHITE_SPAWN);
					} else {
						addStock(0, Item.BLACK_SPAWN);
					}
				} else {
					if (srcArea == UIArea.AREA_PLAYER2_BUTTON_STOCK_WHITE_ID) {
						addStock(1, Item.WHITE_SPAWN);
					} else {
						addStock(1, Item.BLACK_SPAWN);
					}
				}

				if (!isStockEmpty()) {
					action = Action.PICK_SPAWN;
				} else {
					endRound = true;
				}
			}
			break;
		default:
			break;
		}
	}

	private void putSpawn(int src, int dest) {
		switch (src) {
		case UIArea.AREA_PLAYER1_STOCK_1_ID:
			board[dest] = p1Stock[0];
			p1Stock[0] = Item.NONE;
			break;
		case UIArea.AREA_PLAYER1_STOCK_2_ID:
			board[dest] = p1Stock[1];
			p1Stock[1] = Item.NONE;
			break;
		case UIArea.AREA_PLAYER1_STOCK_3_ID:
			board[dest] = p1Stock[2];
			p1Stock[2] = Item.NONE;
			break;
		case UIArea.AREA_PLAYER1_STOCK_4_ID:
			board[dest] = p1Stock[3];
			p1Stock[3] = Item.NONE;
			break;
		case UIArea.AREA_PLAYER2_STOCK_1_ID:
			board[dest] = p2Stock[0];
			p2Stock[0] = Item.NONE;
			break;
		case UIArea.AREA_PLAYER2_STOCK_2_ID:
			board[dest] = p2Stock[1];
			p2Stock[1] = Item.NONE;
			break;
		case UIArea.AREA_PLAYER2_STOCK_3_ID:
			board[dest] = p2Stock[2];
			p2Stock[2] = Item.NONE;
			break;
		case UIArea.AREA_PLAYER2_STOCK_4_ID:
			board[dest] = p2Stock[3];
			p2Stock[3] = Item.NONE;
			break;
		default:
			break;
		}
	}

	public boolean isStockEmpty() {
		return wSpawnleft + bSpawnleft == 0;
	}

	private boolean isRobot(int src) {
		return board[src].equals(Item.RED_ROBOT) || board[src].equals(Item.BLACK_ROBOT)
				|| board[src].equals(Item.WHITE_ROBOT);
	}

	private boolean canMoveRobot(int src, int dest) {
		if (!Matrix.areContiguous(src, dest)) {
			return false;
		}

		switch (board[src]) {
		case RED_ROBOT:
			return board[dest].equals(Item.WHITE_SPAWN) || board[dest].equals(Item.BLACK_SPAWN);
		case WHITE_ROBOT:
			return board[dest].equals(Item.WHITE_SPAWN);
		case BLACK_ROBOT:
			return board[dest].equals(Item.BLACK_SPAWN);
		default:
			return false;
		}
	}

	private boolean canMoveRobot(int tileId) {
		int grid[] = Matrix.getTileArray(tileId);
		for (int i = 0; i < grid.length; i++) {
			if (grid[i] == 1) {
				switch (board[srcArea]) {
				case RED_ROBOT:
					if (board[i].equals(Item.BLACK_SPAWN) || board[i].equals(Item.WHITE_SPAWN)) {
						return true;
					}
				case WHITE_ROBOT:
					if (board[i].equals(Item.WHITE_SPAWN)) {
						return true;
					}
				case BLACK_ROBOT:
					if (board[i].equals(Item.BLACK_SPAWN)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private void moveRobot(int src, int dest) {
		switch (board[src]) {
		case RED_ROBOT:
			board[src] = Item.NONE;
			board[dest] = Item.RED_ROBOT;
			break;
		case WHITE_ROBOT:
			board[src] = Item.NONE;
			board[dest] = Item.WHITE_ROBOT;
			break;
		case BLACK_ROBOT:
			board[src] = Item.NONE;
			board[dest] = Item.BLACK_ROBOT;
			break;
		default:
			break;
		}
	}

	private void addStock(int playerId, Item color) {
		if (playerId == 0) {
			for (int i = 0; i < 4; i++) {
				if (p1Stock[i].equals(Item.NONE)) {
					p1Stock[i] = color;
					if (color.equals(Item.BLACK_SPAWN)) {
						bSpawnleft--;
					} else {
						wSpawnleft--;
					}
					return;
				}
			}
		} else {
			for (int i = 0; i < 4; i++) {
				if (p2Stock[i].equals(Item.NONE)) {
					p2Stock[i] = color;
					if (color.equals(Item.BLACK_SPAWN)) {
						bSpawnleft--;
					} else {
						wSpawnleft--;
					}
					return;
				}
			}
		}
	}

	private boolean isStockFull(int playerId) {
		if (playerId == 0) {
			for (Item sc : p1Stock) {
				if (sc.equals(Item.NONE)) {
					return false;
				}
			}
		} else {
			for (Item sc : p2Stock) {
				if (sc.equals(Item.NONE)) {
					return false;
				}
			}
		}

		return true;
	}

	private Item getWhiteSpawn() {
		wSpawnleft--;
		return Item.WHITE_SPAWN;
	}

	private Item getBlackSpawn() {
		bSpawnleft--;
		return Item.BLACK_SPAWN;
	}

	public boolean isPlayerStockFull(int playerid) {
		if (playerid == 0) {
			for (Item i : p1Stock) {
				if (i.equals(Item.NONE)) {
					return false;
				}
			}
		} else {
			for (Item i : p2Stock) {
				if (i.equals(Item.NONE)) {
					return false;
				}
			}
		}
		return true;
	}

	public int getWinner() {
		int wCpt = 0;
		int bCpt = 0;

		for (int i = 0; i < Cnst.TILES_COUNT; i++) {
			if (board[i].equals(Item.RED_ROBOT) || board[i].equals(Item.BLACK_ROBOT)
					|| board[i].equals(Item.WHITE_ROBOT)) {
				if (Matrix.getTileArea(i) == Matrix.WHITE_AREA) {
					wCpt++;
				} else {
					bCpt++;
				}
			}
		}
		return wCpt > bCpt ? 0 : 1;
	}

	private boolean isWhiteSpawnleft() {
		return wSpawnleft > 0;
	}

	private boolean isBlackSpawnleft() {
		return bSpawnleft > 0;
	}

	public int getWhiteSpawnleft() {
		return wSpawnleft;
	}

	public int getBlackSpawnleft() {
		return bSpawnleft;
	}

	public void setSrcArea(int area) {
		this.srcArea = area;
	}

	public void setDestArea(int area) {
		this.destArea = area;
	}

	public int getSrcArea() {
		return srcArea;
	}

	public int getDestArea() {
		return destArea;
	}

	public boolean isSrcSelected() {
		return srcArea != -1;
	}

	public boolean isDestSelected() {
		return destArea != -1;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Item[] getBoard() {
		return board;
	}

	public int getToken() {
		return token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Item[] getStock(int playerId) {
		if (playerId == 0) {
			return p1Stock;
		} else {
			return p2Stock;
		}
	}

	public boolean isEndOfRound() {
		return endRound;
	}
}
