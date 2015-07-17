package com.skula.robotory.services;
import com.skula.robotory.constants.UIArea;
import com.skula.robotory.enums.Action;
import com.skula.robotory.enums.Item;
import com.skula.robotory.enums.SpawnColor;
import com.skula.robotory.models.Matrix;


public class GameEngine {
	private static final int SPAWNS_COUNT = 14;

	private int token;
	private Action action;
	private int srcArea;
	private int destArea;
	
	private Item board[];
	private int wSpawnleft;
	private int bSpawnleft;
	private SpawnColor p1Stock[];
	private SpawnColor p2Stock[];

	public GameEngine() {
		this.token = 0;
		this.board = new Item[24];
		for (int i = 0; i < 24; i++) {
			this.board[i] = Item.NONE;
		}
		this.board[10] = Item.RED_ROBOT;
		this.board[13] = Item.WHITE_ROBOT;
		this.board[14] = Item.BLACK_ROBOT;

		this.wSpawnleft = SPAWNS_COUNT;
		this.bSpawnleft = SPAWNS_COUNT;

		this.p1Stock = new SpawnColor[4];
		this.p2Stock = new SpawnColor[4];
		for(int i=0; i<4; i++){
			p1Stock[i] = SpawnColor.NONE;
			p2Stock[i] = SpawnColor.NONE;
		}
		
		this.action = Action.NONE;
		this.srcArea = -1;
		this.destArea = -1;
	}

	public void nextPlayer() {
		this.token = this.token == 0 ? 1 : 0;
	}
	
	public boolean canProcess(){
		switch(action){
		case MOVE_ROBOT:
			break;
		case PUT_SPAWN:
			break;
		case PICK_SPAWN:
			break;
		case NONE:
			// Clique sur une zone vide
			if(srcArea == UIArea.AREA_NONE_ID){
				return false;
			}		
			// Clique sur une tuile
			if(UIArea.isTile(srcArea)){
				if(isRobot(srcArea)){
					return true;
				}else{
					return false;
				}
			// Clique sur un pion d'energie
			}else if(UIArea.isPlayerStock(srcArea, token)){
				SpawnColor sc = null; 
				switch(srcArea){
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
				if(sc.equals(SpawnColor.NONE)){
					return false;
				}else{
					return true;
				}
			// Clique sur les boutons pour remplir le stock
			}else if(UIArea.isStockBtn(srcArea, token)){
				if(isStockFull(token)){
					return false;
				}
				
				// on test si il reste des pions d'energie dans la pioche commune
				int tmp = 0;
				switch(srcArea){
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
				if(tmp>0){
					return true;
				}else{
					return false;
				}
			}
			return false;
		default:
			break;
		}
		return true;
	}
	
	public void process(){
		switch(action){
		case MOVE_ROBOT:
			break;
		case PUT_SPAWN:
			break;
		case PICK_SPAWN:
			break;
		case NONE:
			if(UIArea.isTile(srcArea)){
				action = Action.MOVE_ROBOT;
			}else if(UIArea.isPlayerStock(srcArea, token)){
				action = Action.PUT_SPAWN;
			}else{
				// ????
			}
			break;
		default:
			break;
		}
	}

	public boolean putSpawn(int dest, SpawnColor spawnColor) {
		if (!board[dest].equals(Item.NONE)) {
			return false;
		}

		switch (spawnColor) {
		case WHITE:
			board[dest] = Item.WHITE_SPAWN;
			break;
		case BLACK:
			board[dest] = Item.BLACK_SPAWN;
			break;
		default:
			break;
		}

		return true;
	}

	public boolean isEnd() {
		return wSpawnleft + bSpawnleft == 0;
	}

	public boolean isRobot(int src) {
		return board[src].equals(Item.RED_ROBOT)
				|| board[src].equals(Item.BLACK_ROBOT)
				|| board[src].equals(Item.WHITE_ROBOT);
	}

	public boolean moveRobot(int src, int dest) {
		if (!board[src].equals(Item.RED_ROBOT)
				&& !board[src].equals(Item.BLACK_ROBOT)
				&& !board[src].equals(Item.WHITE_ROBOT)) {
			return false;
		}

		if (!Matrix.areContiguous(src, dest)) {
			return false;
		}

		if (!board[dest].equals(Item.WHITE_SPAWN)
				&& !board[dest].equals(Item.BLACK_SPAWN)) {
			return false;
		}

		switch (board[src]) {
		case RED_ROBOT:
			board[src] = Item.NONE;
			board[dest] = Item.RED_ROBOT;
			break;
		case WHITE_ROBOT:
			if (!board[dest].equals(Item.WHITE_SPAWN)) {
				return false;
			}
			board[src] = Item.NONE;
			board[dest] = Item.WHITE_ROBOT;
			break;
		case BLACK_ROBOT:
			if (!board[dest].equals(Item.BLACK_SPAWN)) {
				return false;
			}
			board[src] = Item.NONE;
			board[dest] = Item.BLACK_ROBOT;
			break;
		default:
			break;
		}

		return true;
	}

	public void addStock(SpawnColor color) {
		if (token == 0) {
			for (int i = 0; i < 4; i++) {
				if (p1Stock[i] == null) {
					p1Stock[i] = color;
					return;
				}
			}
		} else {
			for (int i = 0; i < 4; i++) {
				if (p2Stock[i] == null) {
					p2Stock[i] = color;
					return;
				}
			}
		}
	}
	
	public boolean isStockFull(int playerId){
		if(playerId == 0){
			for(SpawnColor sc : p1Stock){
				if(sc.equals(SpawnColor.NONE)){
					return false;
				}
			}
		}else{
			for(SpawnColor sc : p1Stock){
				if(sc.equals(SpawnColor.NONE)){
					return false;
				}
			}
		}
		
		return true;
	}

	public SpawnColor getWhiteSpawn() {
		wSpawnleft--;
		return SpawnColor.WHITE;
	}

	public SpawnColor getBlackSpawn() {
		bSpawnleft--;
		return SpawnColor.BLACK;
	}

	public boolean isWhiteSpawnleft() {
		return wSpawnleft > 0;
	}

	public boolean isBlackSpawnleft() {
		return bSpawnleft > 0;
	}
	
	public void setSrcArea(int area){
		this.srcArea = area;
	}
	
	public void setDestArea(int area){
		this.destArea = area;
	}
	
	public int getSrcArea(){
		return srcArea;
	}
	
	public int getDestArea(){
		return destArea;
	}
	
	public boolean isSrcSelected(){
		return srcArea != -1;
	}
	
	public boolean isDestSelected(){
		return destArea != -1;
	}
	
	public Action getAction(){
		return action;
	}
}
