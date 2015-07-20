package com.skula.robotory.services;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.skula.robotory.R;
import com.skula.robotory.constants.PictureLibrary;
import com.skula.robotory.constants.UIArea;
import com.skula.robotory.enums.Item;

// TODO:
// - positionner les areas + tester
// - dessiner les bouton des stock avec chiffres dans les 2 sens
// - bien positionner les images
public class Drawer {
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
		// drawPlayersStock(c);
		// drawBoard(c);
		// drawStockButtons(c);
		paint.setTextSize(30f);
		c.drawText(engine.getMessage(), 50, 50, paint);
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
		for (int i = 0; i < 24; i++) {
			r = UIArea.getArea(i);
			switch (engine.getBoard()[i]) {
			case WHITE_ROBOT:
				c.drawBitmap(lib.get(R.drawable.robot_red), new Rect(0, 0, 20, 20), r, paint);
				break;
			case BLACK_ROBOT:
				c.drawBitmap(lib.get(R.drawable.robot_white), new Rect(0, 0, 20, 20), r, paint);
				break;
			case RED_ROBOT:
				c.drawBitmap(lib.get(R.drawable.robot_black), new Rect(0, 0, 20, 20), r, paint);
				break;
			default:
				drawStockSpawn(c, engine.getBoard()[i], r);
			}
		}
	}

	private void drawPlayersStock(Canvas c) {
		// player 1
		drawStockSpawn(c, engine.getStock(0)[0], new Rect(0, 0, 20, 20));
		drawStockSpawn(c, engine.getStock(0)[1], new Rect(0, 0, 20, 20));
		drawStockSpawn(c, engine.getStock(0)[2], new Rect(0, 0, 20, 20));
		drawStockSpawn(c, engine.getStock(0)[3], new Rect(0, 0, 20, 20));

		// player 2
		drawStockSpawn(c, engine.getStock(1)[0], new Rect(0, 0, 20, 20));
		drawStockSpawn(c, engine.getStock(1)[1], new Rect(0, 0, 20, 20));
		drawStockSpawn(c, engine.getStock(1)[2], new Rect(0, 0, 20, 20));
		drawStockSpawn(c, engine.getStock(1)[3], new Rect(0, 0, 20, 20));
	}

	private void drawStockSpawn(Canvas c, Item i, Rect r) {
		switch (i) {
		case WHITE_SPAWN:
			c.drawBitmap(lib.get(R.drawable.spawn_white), new Rect(0, 0, 20, 20), r, paint);
			break;
		case BLACK_SPAWN:
			c.drawBitmap(lib.get(R.drawable.spawn_black), new Rect(0, 0, 800, 1200), r, paint);
			break;
		default:
			break;
		}
	}

	private void drawStockButtons(Canvas c) {

	}
}