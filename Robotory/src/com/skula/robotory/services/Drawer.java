package com.skula.robotory.services;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.skula.robotory.R;
import com.skula.robotory.constants.Cnst;
import com.skula.robotory.constants.PictureLibrary;
import com.skula.robotory.constants.UIArea;
import com.skula.robotory.enums.Item;

public class Drawer {
	private static final int ROBOT_SIZE = 150;
	private static final int SPAWN_SIZE = 80;

	private PictureLibrary lib;
	private Paint paint;
	private GameEngine engine;

	public Drawer(Resources res, GameEngine engine) {
		this.engine = engine;
		this.paint = new Paint();
		this.lib = new PictureLibrary(res);
	}

	public void draw(Canvas c) {
		drawBackground(c);
		drawBoard(c);
		drawPlayersStock(c);
		drawStockButtons(c);
		// drawArea(c);
		paint.setTextSize(25f);
		paint.setColor(Color.RED);
		c.drawText("Src: " + UIArea.getAreaLabel(engine.getSrcArea()), 300, 50, paint);
		c.drawText("Dest: " + UIArea.getAreaLabel(engine.getDestArea()), 300, 100, paint);
		c.drawText("Joueur " + (engine.getToken() + 1), 300, 150, paint);
	}

	public void drawEndGame(Canvas c) {
		c.drawBitmap(lib.get(R.drawable.background_endgame), new Rect(0, 0, 800, 1280), new Rect(0, 0, 800, 1200),
				paint);
		if (engine.getWinner() == 0) {
			c.drawBitmap(lib.get(R.drawable.p1_victory), new Rect(0, 0, 800, 600), new Rect(0, 0, 800, 600), paint);
			c.drawBitmap(lib.get(R.drawable.p2_defeat), new Rect(0, 0, 800, 600), new Rect(0, 600, 800, 1200), paint);
		} else {
			c.drawBitmap(lib.get(R.drawable.p1_defeat), new Rect(0, 0, 800, 600), new Rect(0, 0, 800, 600), paint);
			c.drawBitmap(lib.get(R.drawable.p2_victory), new Rect(0, 0, 800, 600), new Rect(0, 600, 800, 1200), paint);
		}
	}

	private void drawArea(Canvas c) {
		paint.setColor(Color.RED);
		c.drawRect(UIArea.AREA_TILE_1, paint);
		c.drawRect(UIArea.AREA_TILE_2, paint);
		c.drawRect(UIArea.AREA_TILE_3, paint);
		c.drawRect(UIArea.AREA_TILE_4, paint);
		c.drawRect(UIArea.AREA_TILE_5, paint);
		c.drawRect(UIArea.AREA_TILE_6, paint);
		c.drawRect(UIArea.AREA_TILE_7, paint);
		c.drawRect(UIArea.AREA_TILE_8, paint);
		c.drawRect(UIArea.AREA_TILE_9, paint);
		c.drawRect(UIArea.AREA_TILE_10, paint);
		c.drawRect(UIArea.AREA_TILE_11, paint);
		c.drawRect(UIArea.AREA_TILE_12, paint);
		c.drawRect(UIArea.AREA_TILE_13, paint);
		c.drawRect(UIArea.AREA_TILE_14, paint);
		c.drawRect(UIArea.AREA_TILE_15, paint);
		c.drawRect(UIArea.AREA_TILE_16, paint);
		c.drawRect(UIArea.AREA_TILE_17, paint);
		c.drawRect(UIArea.AREA_TILE_18, paint);
		c.drawRect(UIArea.AREA_TILE_19, paint);
		c.drawRect(UIArea.AREA_TILE_20, paint);
		c.drawRect(UIArea.AREA_TILE_21, paint);
		c.drawRect(UIArea.AREA_TILE_22, paint);
		c.drawRect(UIArea.AREA_TILE_23, paint);
		c.drawRect(UIArea.AREA_TILE_24, paint);

		paint.setColor(Color.GREEN);
		c.drawRect(UIArea.AREA_PLAYER1_STOCK_1, paint);
		c.drawRect(UIArea.AREA_PLAYER1_STOCK_2, paint);
		c.drawRect(UIArea.AREA_PLAYER1_STOCK_3, paint);
		c.drawRect(UIArea.AREA_PLAYER1_STOCK_4, paint);
		c.drawRect(UIArea.AREA_PLAYER2_STOCK_1, paint);
		c.drawRect(UIArea.AREA_PLAYER2_STOCK_2, paint);
		c.drawRect(UIArea.AREA_PLAYER2_STOCK_3, paint);
		c.drawRect(UIArea.AREA_PLAYER2_STOCK_4, paint);

		paint.setColor(Color.BLUE);
		c.drawRect(UIArea.AREA_PLAYER1_BUTTON_STOCK_WHITE, paint);
		c.drawRect(UIArea.AREA_PLAYER1_BUTTON_STOCK_BLACK, paint);
		c.drawRect(UIArea.AREA_PLAYER2_BUTTON_STOCK_WHITE, paint);
		c.drawRect(UIArea.AREA_PLAYER2_BUTTON_STOCK_BLACK, paint);
	}

	private void drawBackground(Canvas c) {
		c.drawBitmap(lib.get(R.drawable.background), new Rect(0, 0, 800, 1280), new Rect(0, 0, 800, 1200), paint);
	}

	private void drawBoard(Canvas c) {
		Rect r = null;
		for (int i = 0; i < Cnst.TILES_COUNT; i++) {
			r = UIArea.getArea(i);
			Rect rr = null;
			switch (engine.getBoard()[i]) {
			case WHITE_ROBOT:
				c.drawBitmap(lib.get(R.drawable.robot_white), new Rect(0, 0, ROBOT_SIZE, ROBOT_SIZE), getRobotSpot(r),
						paint);
				break;
			case BLACK_ROBOT:
				c.drawBitmap(lib.get(R.drawable.robot_black), new Rect(0, 0, ROBOT_SIZE, ROBOT_SIZE), getRobotSpot(r),
						paint);
				break;
			case RED_ROBOT:
				c.drawBitmap(lib.get(R.drawable.robot_red), new Rect(0, 0, ROBOT_SIZE, ROBOT_SIZE), getRobotSpot(r),
						paint);
				break;
			default:
				rr = new Rect(r.left + 24, r.top + 31, r.left + 24 + SPAWN_SIZE, r.top + 31 + SPAWN_SIZE);
				drawSpawn(c, engine.getBoard()[i], rr);
			}
		}
	}

	private Rect getRobotSpot(Rect r) {
		return new Rect(r.left - 10, r.top - 4, r.left - 10 + ROBOT_SIZE, r.top - 4 + ROBOT_SIZE);
	}

	private void drawPlayersStock(Canvas c) {
		// player 1
		drawSpawn(c, engine.getStock(0)[0], UIArea.AREA_PLAYER1_STOCK_1);
		drawSpawn(c, engine.getStock(0)[1], UIArea.AREA_PLAYER1_STOCK_2);
		drawSpawn(c, engine.getStock(0)[2], UIArea.AREA_PLAYER1_STOCK_3);
		drawSpawn(c, engine.getStock(0)[3], UIArea.AREA_PLAYER1_STOCK_4);

		// player 2
		drawSpawn(c, engine.getStock(1)[0], UIArea.AREA_PLAYER2_STOCK_1);
		drawSpawn(c, engine.getStock(1)[1], UIArea.AREA_PLAYER2_STOCK_2);
		drawSpawn(c, engine.getStock(1)[2], UIArea.AREA_PLAYER2_STOCK_3);
		drawSpawn(c, engine.getStock(1)[3], UIArea.AREA_PLAYER2_STOCK_4);
	}

	private void drawSpawn(Canvas c, Item i, Rect r) {
		switch (i) {
		case WHITE_SPAWN:
			c.drawBitmap(lib.get(R.drawable.spawn_white), new Rect(0, 0, SPAWN_SIZE, SPAWN_SIZE), r, paint);
			break;
		case BLACK_SPAWN:
			c.drawBitmap(lib.get(R.drawable.spawn_black), new Rect(0, 0, SPAWN_SIZE, SPAWN_SIZE), r, paint);
			break;
		default:
			break;
		}
	}

	private void drawStockButtons(Canvas c) {
		int idp1 = 0;
		int idp2 = 0;

		switch (engine.getWhiteSpawnleft()) {
		case 1:
			idp1 = R.drawable.btn_wstock_p1_01;
			idp2 = R.drawable.btn_wstock_p2_01;
			break;
		case 2:
			idp1 = R.drawable.btn_wstock_p1_02;
			idp2 = R.drawable.btn_wstock_p2_02;
			break;
		case 3:
			idp1 = R.drawable.btn_wstock_p1_03;
			idp2 = R.drawable.btn_wstock_p2_03;
			break;
		case 4:
			idp1 = R.drawable.btn_wstock_p1_04;
			idp2 = R.drawable.btn_wstock_p2_04;
			break;
		case 5:
			idp1 = R.drawable.btn_wstock_p1_05;
			idp2 = R.drawable.btn_wstock_p2_05;
			break;
		case 6:
			idp1 = R.drawable.btn_wstock_p1_06;
			idp2 = R.drawable.btn_wstock_p2_06;
			break;
		case 7:
			idp1 = R.drawable.btn_wstock_p1_07;
			idp2 = R.drawable.btn_wstock_p2_07;
			break;
		case 8:
			idp1 = R.drawable.btn_wstock_p1_08;
			idp2 = R.drawable.btn_wstock_p2_08;
			break;
		case 9:
			idp1 = R.drawable.btn_wstock_p1_09;
			idp2 = R.drawable.btn_wstock_p2_09;
			break;
		case 10:
			idp1 = R.drawable.btn_wstock_p1_10;
			idp2 = R.drawable.btn_wstock_p2_10;
			break;
		case 11:
			idp1 = R.drawable.btn_wstock_p1_11;
			idp2 = R.drawable.btn_wstock_p2_11;
			break;
		case 12:
			idp1 = R.drawable.btn_wstock_p1_12;
			idp2 = R.drawable.btn_wstock_p2_12;
			break;
		case 13:
			idp1 = R.drawable.btn_wstock_p1_13;
			idp2 = R.drawable.btn_wstock_p2_13;
			break;
		case 14:
			idp1 = R.drawable.btn_wstock_p1_14;
			idp2 = R.drawable.btn_wstock_p2_14;
			break;
		default:
			idp1 = -1;
			idp2 = -1;
			break;
		}

		if (idp1 != -1 || idp2 != -1) {
			c.drawBitmap(lib.get(idp1), new Rect(0, 0, 100, 100), UIArea.AREA_PLAYER1_BUTTON_STOCK_WHITE, paint);
			c.drawBitmap(lib.get(idp2), new Rect(0, 0, 100, 100), UIArea.AREA_PLAYER2_BUTTON_STOCK_WHITE, paint);
		}

		switch (engine.getBlackSpawnleft()) {
		case 1:
			idp1 = R.drawable.btn_bstock_p1_01;
			idp2 = R.drawable.btn_bstock_p2_01;
			break;
		case 2:
			idp1 = R.drawable.btn_bstock_p1_02;
			idp2 = R.drawable.btn_bstock_p2_02;
			break;
		case 3:
			idp1 = R.drawable.btn_bstock_p1_03;
			idp2 = R.drawable.btn_bstock_p2_03;
			break;
		case 4:
			idp1 = R.drawable.btn_bstock_p1_04;
			idp2 = R.drawable.btn_bstock_p2_04;
			break;
		case 5:
			idp1 = R.drawable.btn_bstock_p1_05;
			idp2 = R.drawable.btn_bstock_p2_05;
			break;
		case 6:
			idp1 = R.drawable.btn_bstock_p1_06;
			idp2 = R.drawable.btn_bstock_p2_06;
			break;
		case 7:
			idp1 = R.drawable.btn_bstock_p1_07;
			idp2 = R.drawable.btn_bstock_p2_07;
			break;
		case 8:
			idp1 = R.drawable.btn_bstock_p1_08;
			idp2 = R.drawable.btn_bstock_p2_08;
			break;
		case 9:
			idp1 = R.drawable.btn_bstock_p1_09;
			idp2 = R.drawable.btn_bstock_p2_09;
			break;
		case 10:
			idp1 = R.drawable.btn_bstock_p1_10;
			idp2 = R.drawable.btn_bstock_p2_10;
			break;
		case 11:
			idp1 = R.drawable.btn_bstock_p1_11;
			idp2 = R.drawable.btn_bstock_p2_11;
			break;
		case 12:
			idp1 = R.drawable.btn_bstock_p1_12;
			idp2 = R.drawable.btn_bstock_p2_12;
			break;
		case 13:
			idp1 = R.drawable.btn_bstock_p1_13;
			idp2 = R.drawable.btn_bstock_p2_13;
			break;
		case 14:
			idp1 = R.drawable.btn_bstock_p1_14;
			idp2 = R.drawable.btn_bstock_p2_14;
			break;
		default:
			idp1 = -1;
			idp2 = -1;
			break;
		}

		if (idp1 != -1 || idp2 != -1) {
			c.drawBitmap(lib.get(idp1), new Rect(0, 0, 100, 100), UIArea.AREA_PLAYER1_BUTTON_STOCK_BLACK, paint);
			c.drawBitmap(lib.get(idp2), new Rect(0, 0, 100, 100), UIArea.AREA_PLAYER2_BUTTON_STOCK_BLACK, paint);
		}
	}

}