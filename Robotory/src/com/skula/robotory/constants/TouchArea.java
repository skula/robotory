package com.skula.robotory.constants;

import android.graphics.Rect;

public class TouchArea {
	public static final int TILE_WIDTH = 150;
	public static final int TILE_HEIGHT = 150;
	public static final int DX = 187;
	public static final int DY = 101;

	public static final Rect TILE_1 = new Rect(DrawAreas.X0 + 458, DrawAreas.Y0 + 222, DrawAreas.X0 + 458 + TILE_WIDTH,
			DrawAreas.Y0 + 222 + TILE_HEIGHT);
	public static final Rect TILE_2 = new Rect(TILE_1.left - DX, TILE_1.top + DY, TILE_1.right - DX, TILE_1.bottom + DY);
	public static final Rect TILE_3 = new Rect(TILE_2.left - DX, TILE_2.top + DY, TILE_2.right - DX, TILE_2.bottom + DY);

	public static final Rect TILE_4 = new Rect(TILE_1.left + 1 + DX, TILE_1.top + DY, TILE_1.right + DX + 1,
			TILE_1.bottom + DY);
	public static final Rect TILE_5 = new Rect(TILE_4.left - DX, TILE_4.top + DY, TILE_4.right - DX, TILE_4.bottom + DY);
	public static final Rect TILE_6 = new Rect(TILE_5.left - DX, TILE_5.top + DY, TILE_5.right - DX, TILE_5.bottom + DY);
	public static final Rect TILE_7 = new Rect(TILE_6.left - DX, TILE_6.top + DY, TILE_6.right - DX, TILE_6.bottom + DY);

	public static final Rect TILE_8 = new Rect(TILE_4.left + DX, TILE_4.top + DY, TILE_4.right + DX, TILE_4.bottom + DY);
	public static final Rect TILE_9 = new Rect(TILE_8.left - DX, TILE_8.top + DY, TILE_8.right - DX, TILE_8.bottom + DY);
	public static final Rect TILE_10 = new Rect(TILE_9.left - DX, TILE_9.top + DY, TILE_9.right - DX, TILE_9.bottom
			+ DY);
	public static final Rect TILE_11 = new Rect(TILE_10.left - DX, TILE_10.top + DY, TILE_10.right - DX, TILE_10.bottom
			+ DY);
	public static final Rect TILE_12 = new Rect(TILE_11.left - DX, TILE_11.top + DY, TILE_11.right - DX, TILE_11.bottom
			+ DY);

	public static final Rect TILE_13 = new Rect(TILE_9.left + DX, TILE_9.top + DY, TILE_9.right + DX, TILE_9.bottom
			+ DY);
	public static final Rect TILE_14 = new Rect(TILE_13.left - DX, TILE_13.top + DY, TILE_13.right - DX, TILE_13.bottom
			+ DY);
	public static final Rect TILE_15 = new Rect(TILE_14.left - DX, TILE_14.top + DY, TILE_14.right - DX, TILE_14.bottom
			+ DY);
	public static final Rect TILE_16 = new Rect(TILE_15.left - DX, TILE_15.top + DY, TILE_15.right - DX, TILE_15.bottom
			+ DY);
	public static final Rect TILE_17 = new Rect(TILE_16.left - DX, TILE_16.top + DY, TILE_16.right - DX, TILE_16.bottom
			+ DY);

	public static final Rect TILE_18 = new Rect(TILE_14.left + DX, TILE_14.top + DY, TILE_14.right + DX, TILE_14.bottom
			+ DY);
	public static final Rect TILE_19 = new Rect(TILE_18.left - DX, TILE_18.top + DY, TILE_18.right - DX, TILE_18.bottom
			+ DY);
	public static final Rect TILE_20 = new Rect(TILE_19.left - DX, TILE_19.top + DY, TILE_19.right - DX, TILE_19.bottom
			+ DY);
	public static final Rect TILE_21 = new Rect(TILE_20.left - DX, TILE_20.top + DY, TILE_20.right - DX, TILE_20.bottom
			+ DY);

	public static final Rect TILE_22 = new Rect(TILE_19.left + DX, TILE_19.top + DY, TILE_19.right + DX, TILE_19.bottom
			+ DY);
	public static final Rect TILE_23 = new Rect(TILE_22.left - DX, TILE_22.top + DY, TILE_22.right - DX, TILE_22.bottom
			+ DY);
	public static final Rect TILE_24 = new Rect(TILE_23.left - DX, TILE_23.top + DY, TILE_23.right - DX, TILE_23.bottom
			+ DY);

	public static final int STOCK_SIZE = 100;
	public static final int STOCK_DX = 134;
	public static final int STOCK_DDX = 67;
	public static final int STOCK_DDY = 110;
	public static final Rect PLAYER1_STOCK_3 = new Rect(DrawAreas.X0 + 58, DrawAreas.Y0 + 68, DrawAreas.X0 + 58
			+ STOCK_SIZE, DrawAreas.Y0 + 68 + STOCK_SIZE);
	public static final Rect PLAYER1_STOCK_2 = new Rect(PLAYER1_STOCK_3.left + STOCK_DX, PLAYER1_STOCK_3.top,
			PLAYER1_STOCK_3.right + STOCK_DX, PLAYER1_STOCK_3.bottom);
	public static final Rect PLAYER1_STOCK_1 = new Rect(PLAYER1_STOCK_2.left + STOCK_DX, PLAYER1_STOCK_2.top,
			PLAYER1_STOCK_2.right + STOCK_DX, PLAYER1_STOCK_2.bottom);
	public static final Rect PLAYER1_STOCK_4 = new Rect(PLAYER1_STOCK_3.left + STOCK_DDX, PLAYER1_STOCK_3.top
			+ STOCK_DDY, PLAYER1_STOCK_3.right + STOCK_DDX, PLAYER1_STOCK_3.bottom + STOCK_DDY);

	public static final Rect PLAYER2_STOCK_1 = new Rect(DrawAreas.X0 + 643, DrawAreas.Y0 + 1431, DrawAreas.X0 + 643
			+ STOCK_SIZE, DrawAreas.Y0 + 1431 + STOCK_SIZE);
	public static final Rect PLAYER2_STOCK_2 = new Rect(PLAYER2_STOCK_1.left + STOCK_DX, PLAYER2_STOCK_1.top,
			PLAYER2_STOCK_1.right + STOCK_DX, PLAYER2_STOCK_1.bottom);
	public static final Rect PLAYER2_STOCK_3 = new Rect(PLAYER2_STOCK_2.left + STOCK_DX, PLAYER2_STOCK_2.top,
			PLAYER2_STOCK_2.right + STOCK_DX, PLAYER2_STOCK_2.bottom);
	public static final Rect PLAYER2_STOCK_4 = new Rect(PLAYER2_STOCK_3.left - STOCK_DDX, PLAYER2_STOCK_3.top
			- STOCK_DDY, PLAYER2_STOCK_3.right - STOCK_DDX, PLAYER2_STOCK_3.bottom - STOCK_DDY);

	public static final int BUTTON_STOCK_DX = 60;
	public static final Rect AREA_PLAYER1_STOCK_BLACK = new Rect(982, 233, 982 + STOCK_SIZE, 233 + STOCK_SIZE);
	public static final Rect AREA_PLAYER1_STOCK_WHITE = new Rect(AREA_PLAYER1_STOCK_BLACK.left
			- BUTTON_STOCK_DX - STOCK_SIZE, AREA_PLAYER1_STOCK_BLACK.top, AREA_PLAYER1_STOCK_BLACK.right
			- BUTTON_STOCK_DX - STOCK_SIZE, AREA_PLAYER1_STOCK_BLACK.bottom);

	public static final Rect AREA_PLAYER2_STOCK_BLACK = new Rect(135, 1515, 135 + STOCK_SIZE, 1515 + STOCK_SIZE);
	public static final Rect AREA_PLAYER2_STOCK_WHITE = new Rect(AREA_PLAYER2_STOCK_BLACK.left
			+ BUTTON_STOCK_DX + STOCK_SIZE, AREA_PLAYER2_STOCK_BLACK.top, AREA_PLAYER2_STOCK_BLACK.right
			+ BUTTON_STOCK_DX + STOCK_SIZE, AREA_PLAYER2_STOCK_BLACK.bottom);
	
	public static final int PLAYER2_OK_ID = 210;
	public static final Rect PLAYER2_OK = new Rect(0, 0, 100, 100);

	public static final int PLAYER1_OK_ID = 200;
	public static final Rect PLAYER1_OK = new Rect(0, 0, 100, 100);
	

	public static final int PLAYER2_STOCK_WHITE_ID = 211;
	public static final Rect PLAYER2_STOCK_WHITE = new Rect(160, 1038, 160 , // 40,138
			1038 );
	public static final int PLAYER2_STOCK_BLACK_ID = 212;
	public static final Rect PLAYER2_STOCK_BLACK = new Rect(40, 1038, 40 , // 40,138
			1038 );
	
	public static final int PLAYER1_STOCK_WHITE_ID = 201;
	public static final Rect PLAYER1_STOCK_WHITE = new Rect(555, 80, 555,
			80);
	public static final int PLAYER1_STOCK_BLACK_ID = 202;
	public static final Rect PLAYER1_STOCK_BLACK = new Rect(675, 80, 675,
			80);
	
	public static final int NONE_ID = -1;
	
	public static final int TILE_1_ID = 0;
	public static final int TILE_2_ID = 1;
	public static final int TILE_3_ID = 2;
	public static final int TILE_4_ID = 3;
	public static final int TILE_5_ID = 4;
	public static final int TILE_6_ID = 5;
	public static final int TILE_7_ID = 6;
	public static final int TILE_8_ID = 7;
	public static final int TILE_9_ID = 8;
	public static final int TILE_10_ID = 9;
	public static final int TILE_11_ID = 10;
	public static final int TILE_12_ID = 11;
	public static final int TILE_13_ID = 12;
	public static final int TILE_14_ID = 13;
	public static final int TILE_15_ID = 14;
	public static final int TILE_16_ID = 15;
	public static final int TILE_17_ID = 16;
	public static final int TILE_18_ID = 17;
	public static final int TILE_19_ID = 18;
	public static final int TILE_20_ID = 19;
	public static final int TILE_21_ID = 20;
	public static final int TILE_22_ID = 21;
	public static final int TILE_23_ID = 22;
	public static final int TILE_24_ID = 23;
	
	public static final int PLAYER1_STOCK_1_ID = 24;
	public static final int PLAYER1_STOCK_2_ID = 25;
	public static final int PLAYER1_STOCK_3_ID = 26;
	public static final int PLAYER1_STOCK_4_ID = 27;
	public static final int PLAYER2_STOCK_1_ID = 28;
	public static final int PLAYER2_STOCK_2_ID = 29;
	public static final int PLAYER2_STOCK_3_ID = 30;
	public static final int PLAYER2_STOCK_4_ID = 31;
	
	public static final int AREA_PLAYER1_STOCK_BLACK_ID = 32;
	public static final int AREA_PLAYER1_STOCK_WHITE_ID = 33;
	public static final int AREA_PLAYER2_STOCK_BLACK_ID = 34;
	public static final int AREA_PLAYER2_STOCK_WHITE_ID = 35;
	
	
	public static boolean isTile(int i) {
		return i >= TILE_1_ID && i <= TILE_24_ID;
	}

	public static boolean isStockBtn(int i, int playerId) {
		if (playerId == 0) {
			return i == PLAYER1_STOCK_WHITE_ID || i == PLAYER1_STOCK_BLACK_ID;
		} else {
			return i == PLAYER2_STOCK_WHITE_ID || i == PLAYER2_STOCK_BLACK_ID;
		}
	}

	public static boolean isPlayerStock(int i, int playerId) {
		if (playerId == 0) {
			return i == PLAYER1_STOCK_1_ID || i == PLAYER1_STOCK_2_ID || i == PLAYER1_STOCK_3_ID
					|| i == PLAYER1_STOCK_4_ID;
		} else {
			return i == PLAYER2_STOCK_1_ID || i == PLAYER2_STOCK_2_ID || i == PLAYER2_STOCK_3_ID
					|| i == PLAYER2_STOCK_4_ID;
		}
	}
	
	public static int getArea(int x, int y) {
		// TILE_1
		if (TILE_1.contains(x, y)) {
			return TILE_1_ID;
		}

		// TILE_2
		if (TILE_2.contains(x, y)) {
			return TILE_2_ID;
		}

		// TILE_3
		if (TILE_3.contains(x, y)) {
			return TILE_3_ID;
		}

		// TILE_4
		if (TILE_4.contains(x, y)) {
			return TILE_4_ID;
		}

		// TILE_5
		if (TILE_5.contains(x, y)) {
			return TILE_5_ID;
		}

		// TILE_6
		if (TILE_6.contains(x, y)) {
			return TILE_6_ID;
		}

		// TILE_7
		if (TILE_7.contains(x, y)) {
			return TILE_7_ID;
		}

		// TILE_8
		if (TILE_8.contains(x, y)) {
			return TILE_8_ID;
		}

		// TILE_9
		if (TILE_9.contains(x, y)) {
			return TILE_9_ID;
		}

		// TILE_10
		if (TILE_10.contains(x, y)) {
			return TILE_10_ID;
		}

		// TILE_11
		if (TILE_11.contains(x, y)) {
			return TILE_11_ID;
		}

		// TILE_12
		if (TILE_12.contains(x, y)) {
			return TILE_12_ID;
		}

		// TILE_13
		if (TILE_13.contains(x, y)) {
			return TILE_13_ID;
		}

		// TILE_14
		if (TILE_14.contains(x, y)) {
			return TILE_14_ID;
		}

		// TILE_15
		if (TILE_15.contains(x, y)) {
			return TILE_15_ID;
		}

		// TILE_16
		if (TILE_16.contains(x, y)) {
			return TILE_16_ID;
		}

		// TILE_17
		if (TILE_17.contains(x, y)) {
			return TILE_17_ID;
		}

		// TILE_18
		if (TILE_18.contains(x, y)) {
			return TILE_18_ID;
		}

		// TILE_19
		if (TILE_19.contains(x, y)) {
			return TILE_19_ID;
		}

		// TILE_20
		if (TILE_20.contains(x, y)) {
			return TILE_20_ID;
		}

		// TILE_21
		if (TILE_21.contains(x, y)) {
			return TILE_21_ID;
		}

		// TILE_22
		if (TILE_22.contains(x, y)) {
			return TILE_22_ID;
		}

		// TILE_23
		if (TILE_23.contains(x, y)) {
			return TILE_23_ID;
		}

		// TILE_24
		if (TILE_24.contains(x, y)) {
			return TILE_24_ID;
		}

		/***************************/

		// PLAYER1_STOCK_1
		if (PLAYER1_STOCK_1.contains(x, y)) {
			return PLAYER1_STOCK_1_ID;
		}

		// PLAYER1_STOCK_2
		if (PLAYER1_STOCK_2.contains(x, y)) {
			return PLAYER1_STOCK_2_ID;
		}

		// PLAYER1_STOCK_3
		if (PLAYER1_STOCK_3.contains(x, y)) {
			return PLAYER1_STOCK_3_ID;
		}

		// PLAYER1_STOCK_4
		if (PLAYER1_STOCK_4.contains(x, y)) {
			return PLAYER1_STOCK_4_ID;
		}
		// PLAYER2_STOCK_1
		if (PLAYER2_STOCK_1.contains(x, y)) {
			return PLAYER2_STOCK_1_ID;
		}

		// PLAYER2_STOCK_2
		if (PLAYER2_STOCK_2.contains(x, y)) {
			return PLAYER2_STOCK_2_ID;
		}

		// PLAYER2_STOCK_3
		if (PLAYER2_STOCK_3.contains(x, y)) {
			return PLAYER2_STOCK_3_ID;
		}

		// PLAYER2_STOCK_4
		if (PLAYER2_STOCK_4.contains(x, y)) {
			return PLAYER2_STOCK_4_ID;
		}

		/***************************/

		// PLAYER1_OK
		if (PLAYER1_OK.contains(x, y)) {
			return PLAYER1_OK_ID;
		}

		// PLAYER1_STOCK_WHITE
		if (PLAYER1_STOCK_WHITE.contains(x, y)) {
			return PLAYER1_STOCK_WHITE_ID;
		}

		// PLAYER1_STOCK_BLACK
		if (PLAYER1_STOCK_BLACK.contains(x, y)) {
			return PLAYER1_STOCK_BLACK_ID;
		}

		// PLAYER2_OK
		if (PLAYER2_OK.contains(x, y)) {
			return PLAYER2_OK_ID;
		}

		// PLAYER2_STOCK_WHITE
		if (PLAYER2_STOCK_WHITE.contains(x, y)) {
			return PLAYER2_STOCK_WHITE_ID;
		}

		// PLAYER2_STOCK_BLACK
		if (PLAYER2_STOCK_BLACK.contains(x, y)) {
			return PLAYER2_STOCK_BLACK_ID;
		}

		return NONE_ID;
	}
	
	public static Rect getArea(int id) {
		switch (id) {
		case TILE_1_ID:
			return TILE_1;
		case TILE_2_ID:
			return TILE_2;
		case TILE_3_ID:
			return TILE_3;
		case TILE_4_ID:
			return TILE_4;
		case TILE_5_ID:
			return TILE_5;
		case TILE_6_ID:
			return TILE_6;
		case TILE_7_ID:
			return TILE_7;
		case TILE_8_ID:
			return TILE_8;
		case TILE_9_ID:
			return TILE_9;
		case TILE_10_ID:
			return TILE_10;
		case TILE_11_ID:
			return TILE_11;
		case TILE_12_ID:
			return TILE_12;
		case TILE_13_ID:
			return TILE_13;
		case TILE_14_ID:
			return TILE_14;
		case TILE_15_ID:
			return TILE_15;
		case TILE_16_ID:
			return TILE_16;
		case TILE_17_ID:
			return TILE_17;
		case TILE_18_ID:
			return TILE_18;
		case TILE_19_ID:
			return TILE_19;
		case TILE_20_ID:
			return TILE_20;
		case TILE_21_ID:
			return TILE_21;
		case TILE_22_ID:
			return TILE_22;
		case TILE_23_ID:
			return TILE_23;
		case TILE_24_ID:
			return TILE_24;
		case PLAYER1_STOCK_1_ID:
			return PLAYER1_STOCK_1;
		case PLAYER1_STOCK_2_ID:
			return PLAYER1_STOCK_2;
		case PLAYER1_STOCK_3_ID:
			return PLAYER1_STOCK_3;
		case PLAYER1_STOCK_4_ID:
			return PLAYER1_STOCK_4;
		case PLAYER2_STOCK_1_ID:
			return PLAYER2_STOCK_1;
		case PLAYER2_STOCK_2_ID:
			return PLAYER2_STOCK_2;
		case PLAYER2_STOCK_3_ID:
			return PLAYER2_STOCK_3;
		case PLAYER2_STOCK_4_ID:
			return PLAYER2_STOCK_4;
		case PLAYER1_OK_ID:
			return PLAYER1_OK;
		case PLAYER1_STOCK_WHITE_ID:
			return PLAYER1_STOCK_WHITE;
		case PLAYER1_STOCK_BLACK_ID:
			return PLAYER1_STOCK_BLACK;
		case PLAYER2_OK_ID:
			return PLAYER2_OK;
		case PLAYER2_STOCK_WHITE_ID:
			return PLAYER2_STOCK_WHITE;
		case PLAYER2_STOCK_BLACK_ID:
			return PLAYER2_STOCK_BLACK;
		default:
			return null;
		}
	}
}
