package com.skula.robotory.constants;

import android.graphics.Rect;

public class UIArea {
	public static final int TILE_WIDTH = 130; //OK
	public static final int TILE_HEIGHT = 144; //OK
	public static int BTN_OK_SIZE = 40;
	public static int BTN_STOCK_SIZE = 40;
	public static int AREA_STOCK_SIZE = 40;
	public static final int Y_SPACE = 8; //OK
	public static final int X_SPACE = 10; //OK

	private static final int COL_1_X = 52;
	private static final int COL_2_X = COL_1_X + X_SPACE + TILE_WIDTH;
	private static final int COL_3_X = COL_2_X + X_SPACE + TILE_WIDTH;
	private static final int COL_4_X = COL_3_X + X_SPACE + TILE_WIDTH;
	private static final int COL_5_X = COL_4_X + X_SPACE + TILE_WIDTH;

	private static final int COL_1_5_Y = 320;
	private static final int COL_2_4_Y = COL_1_5_Y - TILE_HEIGHT / 2 - 5;
	private static final int COL_3_Y = COL_2_4_Y - TILE_HEIGHT / 2 - 6;

	// tuiles 0 a 23
	public static final int AREA_TILE_1_ID = 0;
	public static final Rect AREA_TILE_1 = createArea(COL_3_X, COL_3_Y, 0);
	public static final int AREA_TILE_2_ID = 1;
	public static final Rect AREA_TILE_2 = createArea(COL_2_X, COL_2_4_Y, 0);
	public static final int AREA_TILE_3_ID = 2;
	public static final Rect AREA_TILE_3 = createArea(COL_1_X, COL_1_5_Y, 0);
	public static final int AREA_TILE_4_ID = 3;
	public static final Rect AREA_TILE_4 = createArea(COL_4_X, COL_2_4_Y, 0);
	public static final int AREA_TILE_5_ID = 4;
	public static final Rect AREA_TILE_5 = createArea(COL_3_X, COL_3_Y, 1);
	public static final int AREA_TILE_6_ID = 5;
	public static final Rect AREA_TILE_6 = createArea(COL_2_X, COL_2_4_Y, 1);
	public static final int AREA_TILE_7_ID = 6;
	public static final Rect AREA_TILE_7 = createArea(COL_1_X, COL_1_5_Y, 1);
	public static final int AREA_TILE_8_ID = 7;
	public static final Rect AREA_TILE_8 = createArea(COL_5_X, COL_1_5_Y, 0);
	public static final int AREA_TILE_9_ID = 8;
	public static final Rect AREA_TILE_9 = createArea(COL_4_X, COL_2_4_Y, 1);
	public static final int AREA_TILE_10_ID = 9;
	public static final Rect AREA_TILE_10 = createArea(COL_3_X, COL_3_Y, 2);
	public static final int AREA_TILE_11_ID = 10;
	public static final Rect AREA_TILE_11 = createArea(COL_2_X, COL_2_4_Y, 2);
	public static final int AREA_TILE_12_ID = 11;
	public static final Rect AREA_TILE_12 = createArea(COL_1_X, COL_1_5_Y, 2);
	public static final int AREA_TILE_13_ID = 12;
	public static final Rect AREA_TILE_13 = createArea(COL_5_X, COL_1_5_Y, 1);
	public static final int AREA_TILE_14_ID = 13;
	public static final Rect AREA_TILE_14 = createArea(COL_4_X, COL_2_4_Y, 2);
	public static final int AREA_TILE_15_ID = 14;
	public static final Rect AREA_TILE_15 = createArea(COL_3_X, COL_3_Y, 3);
	public static final int AREA_TILE_16_ID = 15;
	public static final Rect AREA_TILE_16 = createArea(COL_2_X, COL_2_4_Y, 3);
	public static final int AREA_TILE_17_ID = 16;
	public static final Rect AREA_TILE_17 = createArea(COL_1_X, COL_1_5_Y, 3);
	public static final int AREA_TILE_18_ID = 17;
	public static final Rect AREA_TILE_18 = createArea(COL_5_X, COL_1_5_Y, 2);
	public static final int AREA_TILE_19_ID = 18;
	public static final Rect AREA_TILE_19 = createArea(COL_4_X, COL_2_4_Y, 3);
	public static final int AREA_TILE_20_ID = 19;
	public static final Rect AREA_TILE_20 = createArea(COL_3_X, COL_3_Y, 4);
	public static final int AREA_TILE_21_ID = 20;
	public static final Rect AREA_TILE_21 = createArea(COL_2_X, COL_2_4_Y, 4);
	public static final int AREA_TILE_22_ID = 21;
	public static final Rect AREA_TILE_22 = createArea(COL_5_X, COL_1_5_Y, 3);
	public static final int AREA_TILE_23_ID = 22;
	public static final Rect AREA_TILE_23 = createArea(COL_4_X, COL_2_4_Y, 4);
	public static final int AREA_TILE_24_ID = 23;
	public static final Rect AREA_TILE_24 = createArea(COL_3_X, COL_3_Y, 5);

	// stock joueur blanc
	public static final int AREA_PLAYER1_STOCK_1_ID = 100;
	public static final Rect AREA_PLAYER1_STOCK_1 = createStock(0, 0);
	public static final int AREA_PLAYER1_STOCK_2_ID = 101;
	public static final Rect AREA_PLAYER1_STOCK_2 = createStock(0, 0);
	public static final int AREA_PLAYER1_STOCK_3_ID = 102;
	public static final Rect AREA_PLAYER1_STOCK_3 = createStock(0, 0);
	public static final int AREA_PLAYER1_STOCK_4_ID = 103;
	public static final Rect AREA_PLAYER1_STOCK_4 = createStock(0, 0);

	// stock joueur gris
	public static final int AREA_PLAYER2_STOCK_1_ID = 110;
	public static final Rect AREA_PLAYER2_STOCK_1 = createStock(0, 0);
	public static final int AREA_PLAYER2_STOCK_2_ID = 111;
	public static final Rect AREA_PLAYER2_STOCK_2 = createStock(0, 0);
	public static final int AREA_PLAYER2_STOCK_3_ID = 112;
	public static final Rect AREA_PLAYER2_STOCK_3 = createStock(0, 0);
	public static final int AREA_PLAYER2_STOCK_4_ID = 113;
	public static final Rect AREA_PLAYER2_STOCK_4 = createStock(0, 0);

	// boutons joueur blanc
	public static final int AREA_PLAYER1_BUTTON_OK_ID = 200;
	public static final Rect AREA_PLAYER1_BUTTON_OK = new Rect(0, 0, BTN_OK_SIZE, BTN_OK_SIZE);
	public static final int AREA_PLAYER1_BUTTON_STOCK_WHITE_ID = 201;
	public static final Rect AREA_PLAYER1_BUTTON_STOCK_WHITE = new Rect(0, 0, BTN_STOCK_SIZE, BTN_STOCK_SIZE);
	public static final int AREA_PLAYER1_BUTTON_STOCK_BLACK_ID = 202;
	public static final Rect AREA_PLAYER1_BUTTON_STOCK_BLACK = new Rect(0, 0, BTN_STOCK_SIZE, BTN_STOCK_SIZE);

	// boutons joueur gris
	public static final int AREA_PLAYER2_BUTTON_OK_ID = 210;
	public static final Rect AREA_PLAYER2_BUTTON_OK = new Rect(0, 0, BTN_OK_SIZE, BTN_OK_SIZE);
	public static final int AREA_PLAYER2_BUTTON_STOCK_WHITE_ID = 211;
	public static final Rect AREA_PLAYER2_BUTTON_STOCK_WHITE = new Rect(0, 0, BTN_STOCK_SIZE, BTN_STOCK_SIZE);
	public static final int AREA_PLAYER2_BUTTON_STOCK_BLACK_ID = 212;
	public static final Rect AREA_PLAYER2_BUTTON_STOCK_BLACK = new Rect(0, 0, BTN_STOCK_SIZE, BTN_STOCK_SIZE);

	// n�ant
	public static final int AREA_NONE_ID = -1;

	private static Rect createArea(int x, int y, int dy) {
		return new Rect(x, y + dy * (TILE_HEIGHT + Y_SPACE), x + TILE_WIDTH, y + dy * (TILE_HEIGHT + Y_SPACE) + TILE_HEIGHT);
	}

	private static Rect createStock(int x, int y) {
		return new Rect(x, y, x + AREA_STOCK_SIZE, y + AREA_STOCK_SIZE);
	}

	public static int getArea(int x, int y) {
		// AREA_TILE_1
		if (AREA_TILE_1.contains(x, y)) {
			return AREA_TILE_1_ID;
		}

		// AREA_TILE_2
		if (AREA_TILE_2.contains(x, y)) {
			return AREA_TILE_2_ID;
		}

		// AREA_TILE_3
		if (AREA_TILE_3.contains(x, y)) {
			return AREA_TILE_3_ID;
		}

		// AREA_TILE_4
		if (AREA_TILE_4.contains(x, y)) {
			return AREA_TILE_4_ID;
		}

		// AREA_TILE_5
		if (AREA_TILE_5.contains(x, y)) {
			return AREA_TILE_5_ID;
		}

		// AREA_TILE_6
		if (AREA_TILE_6.contains(x, y)) {
			return AREA_TILE_6_ID;
		}

		// AREA_TILE_7
		if (AREA_TILE_7.contains(x, y)) {
			return AREA_TILE_7_ID;
		}

		// AREA_TILE_8
		if (AREA_TILE_8.contains(x, y)) {
			return AREA_TILE_8_ID;
		}

		// AREA_TILE_9
		if (AREA_TILE_9.contains(x, y)) {
			return AREA_TILE_9_ID;
		}

		// AREA_TILE_10
		if (AREA_TILE_10.contains(x, y)) {
			return AREA_TILE_10_ID;
		}

		// AREA_TILE_11
		if (AREA_TILE_11.contains(x, y)) {
			return AREA_TILE_11_ID;
		}

		// AREA_TILE_12
		if (AREA_TILE_12.contains(x, y)) {
			return AREA_TILE_12_ID;
		}

		// AREA_TILE_13
		if (AREA_TILE_13.contains(x, y)) {
			return AREA_TILE_13_ID;
		}

		// AREA_TILE_14
		if (AREA_TILE_14.contains(x, y)) {
			return AREA_TILE_14_ID;
		}

		// AREA_TILE_15
		if (AREA_TILE_15.contains(x, y)) {
			return AREA_TILE_15_ID;
		}

		// AREA_TILE_16
		if (AREA_TILE_16.contains(x, y)) {
			return AREA_TILE_16_ID;
		}

		// AREA_TILE_17
		if (AREA_TILE_17.contains(x, y)) {
			return AREA_TILE_17_ID;
		}

		// AREA_TILE_18
		if (AREA_TILE_18.contains(x, y)) {
			return AREA_TILE_18_ID;
		}

		// AREA_TILE_19
		if (AREA_TILE_19.contains(x, y)) {
			return AREA_TILE_19_ID;
		}

		// AREA_TILE_20
		if (AREA_TILE_20.contains(x, y)) {
			return AREA_TILE_20_ID;
		}

		// AREA_TILE_21
		if (AREA_TILE_21.contains(x, y)) {
			return AREA_TILE_21_ID;
		}

		// AREA_TILE_22
		if (AREA_TILE_22.contains(x, y)) {
			return AREA_TILE_22_ID;
		}

		// AREA_TILE_23
		if (AREA_TILE_23.contains(x, y)) {
			return AREA_TILE_23_ID;
		}

		// AREA_TILE_24
		if (AREA_TILE_24.contains(x, y)) {
			return AREA_TILE_24_ID;
		}

		/***************************/

		// AREA_PLAYER1_STOCK_1
		if (AREA_PLAYER1_STOCK_1.contains(x, y)) {
			return AREA_PLAYER1_STOCK_1_ID;
		}

		// AREA_PLAYER1_STOCK_2
		if (AREA_PLAYER1_STOCK_2.contains(x, y)) {
			return AREA_PLAYER1_STOCK_2_ID;
		}

		// AREA_PLAYER1_STOCK_3
		if (AREA_PLAYER1_STOCK_3.contains(x, y)) {
			return AREA_PLAYER1_STOCK_3_ID;
		}

		// AREA_PLAYER1_STOCK_4
		if (AREA_PLAYER1_STOCK_4.contains(x, y)) {
			return AREA_PLAYER1_STOCK_4_ID;
		}
		// AREA_PLAYER2_STOCK_1
		if (AREA_PLAYER2_STOCK_1.contains(x, y)) {
			return AREA_PLAYER2_STOCK_1_ID;
		}

		// AREA_PLAYER2_STOCK_2
		if (AREA_PLAYER2_STOCK_2.contains(x, y)) {
			return AREA_PLAYER2_STOCK_2_ID;
		}

		// AREA_PLAYER2_STOCK_3
		if (AREA_PLAYER2_STOCK_3.contains(x, y)) {
			return AREA_PLAYER2_STOCK_3_ID;
		}

		// AREA_PLAYER2_STOCK_4
		if (AREA_PLAYER2_STOCK_4.contains(x, y)) {
			return AREA_PLAYER2_STOCK_4_ID;
		}

		/***************************/

		// AREA_PLAYER1_BUTTON_OK
		if (AREA_PLAYER1_BUTTON_OK.contains(x, y)) {
			return AREA_PLAYER1_BUTTON_OK_ID;
		}

		// AREA_PLAYER1_BUTTON_STOCK_WHITE
		if (AREA_PLAYER1_BUTTON_STOCK_WHITE.contains(x, y)) {
			return AREA_PLAYER1_BUTTON_STOCK_WHITE_ID;
		}

		// AREA_PLAYER1_BUTTON_STOCK_BLACK
		if (AREA_PLAYER1_BUTTON_STOCK_BLACK.contains(x, y)) {
			return AREA_PLAYER1_BUTTON_STOCK_BLACK_ID;
		}

		// AREA_PLAYER2_BUTTON_OK
		if (AREA_PLAYER2_BUTTON_OK.contains(x, y)) {
			return AREA_PLAYER2_BUTTON_OK_ID;
		}

		// AREA_PLAYER2_BUTTON_STOCK_WHITE
		if (AREA_PLAYER2_BUTTON_STOCK_WHITE.contains(x, y)) {
			return AREA_PLAYER2_BUTTON_STOCK_WHITE_ID;
		}

		// AREA_PLAYER2_BUTTON_STOCK_BLACK
		if (AREA_PLAYER2_BUTTON_STOCK_BLACK.contains(x, y)) {
			return AREA_PLAYER2_BUTTON_STOCK_BLACK_ID;
		}

		return AREA_NONE_ID;
	}

	public static boolean isTile(int i) {
		return i >= AREA_TILE_1_ID && i <= AREA_TILE_24_ID;
	}
}