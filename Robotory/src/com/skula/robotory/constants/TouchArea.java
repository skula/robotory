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
	public static final Rect AREA_PLAYER1_BUTTON_STOCK_BLACK = new Rect(982, 233, 982 + STOCK_SIZE, 233 + STOCK_SIZE);
	public static final Rect AREA_PLAYER1_BUTTON_STOCK_WHITE = new Rect(AREA_PLAYER1_BUTTON_STOCK_BLACK.left
			- BUTTON_STOCK_DX - STOCK_SIZE, AREA_PLAYER1_BUTTON_STOCK_BLACK.top, AREA_PLAYER1_BUTTON_STOCK_BLACK.right
			- BUTTON_STOCK_DX - STOCK_SIZE, AREA_PLAYER1_BUTTON_STOCK_BLACK.bottom);

	public static final Rect AREA_PLAYER2_BUTTON_STOCK_BLACK = new Rect(135, 1515, 135 + STOCK_SIZE, 1515 + STOCK_SIZE);
	public static final Rect AREA_PLAYER2_BUTTON_STOCK_WHITE = new Rect(AREA_PLAYER2_BUTTON_STOCK_BLACK.left
			+ BUTTON_STOCK_DX + STOCK_SIZE, AREA_PLAYER2_BUTTON_STOCK_BLACK.top, AREA_PLAYER2_BUTTON_STOCK_BLACK.right
			+ BUTTON_STOCK_DX + STOCK_SIZE, AREA_PLAYER2_BUTTON_STOCK_BLACK.bottom);
}
