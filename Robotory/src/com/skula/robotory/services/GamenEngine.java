package com.skula.robotory.services;
import com.skula.robotory.enums.Item;
import com.skula.robotory.enums.SpawnColor;
import com.skula.robotory.models.Matrix;


public class GamenEngine {
	private static final int SPAWNS_COUNT = 14;

	private int token;
	private Item board[];
	private int wSpawnleft;
	private int bSpawnleft;
	private SpawnColor p1Stock[];
	private SpawnColor p2Stock[];

	public static void main(String[] args) {

	}

	public GamenEngine() {
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
	}

	public void nextPlayer() {
		this.token = this.token == 0 ? 1 : 0;
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
}
