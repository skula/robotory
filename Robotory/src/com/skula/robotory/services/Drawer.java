package com.skula.robotory.services;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;

import com.skula.robotory.R;
import com.skula.robotory.activities.views.BoardView;
import com.skula.robotory.constants.Cnst;
import com.skula.robotory.constants.DrawAreas;
import com.skula.robotory.constants.PictureLibrary;
import com.skula.robotory.constants.UIArea;
import com.skula.robotory.enums.Item;
import com.skula.robotory.models.Point;

public class Drawer {
	private static final int ROBOT_SIZE = 150;
	private static final int SPAWN_SIZE = 80;

	private PictureLibrary lib;
	private Paint paint;
	private AssetManager assetManager;
	private GameEngine engine;

	private int measuredWidth;
	private int measuredHeight;

	public Drawer(BoardView view, GameEngine engine) {
		this.engine = engine;
		this.paint = new Paint();
		this.assetManager = view.getResources().getAssets();
		this.lib = new PictureLibrary(view.getResources());
		this.measuredWidth = view.getMeasuredWidth();
		this.measuredHeight = view.getMeasuredHeight();
	}

	public void draw(Canvas c) {
		drawBackground(c);
		drawBoard(c);
		drawStockButtons(c);
		// drawPlayersStock(c);
		// drawArea(c);
	}

	private void drawText(Canvas c, Paint paint,  boolean reverse, String txt, Point p) {
		Typeface plain = Typeface.createFromAsset(assetManager, "fonts/OCRASTD.OTF");
		paint.setTypeface(plain);
		paint.setTextSize(60f);
		if (reverse) {
			int cx = measuredWidth / 2;
			int cy = measuredHeight / 2;
			c.save();
			c.scale(1f, -1f, cx, cy);
			c.drawText(txt, cx + p.getX(), cy - p.getY(), paint);
			c.restore();
		} else {
			c.drawText(txt, p.getX(), p.getY(), paint);
		}
	}

	private void drawStockButtons(Canvas c) {
		paint.setColor(Color.WHITE);
		drawText(c, paint, true, engine.getWhiteSpawnleft()+"", new Point(960,265));
		//drawText(c, paint, false, engine.getWhiteSpawnleft()+"", new Point(950,250));
		paint.setColor(Color.BLACK);
		drawText(c, paint, true, engine.getBlackSpawnleft()+"", new Point(850,265));
		//drawText(c, paint, false, engine.getBlackSpawnleft()+"", new Point(900,250));
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
		// c.drawBitmap(lib.get(R.drawable.background), new Rect(0, 0, 800,
		// 1280), new Rect(0, 0, 800, 1200), paint);
		drawPict(c, R.drawable.background, DrawAreas.BOARD);
	}

	private void drawBoard(Canvas c) {
		Rect r = null;
		for (int i = 0; i < Cnst.TILES_COUNT; i++) {
			r = UIArea.getArea(i);
			Rect rr = null;
			switch (engine.getBoard()[i]) {
			case WHITE_ROBOT:
				drawPict(c, R.drawable.robot_white, getRobotSpot(r, R.drawable.robot_white));
				break;
			case BLACK_ROBOT:
				drawPict(c, R.drawable.robot_black, getRobotSpot(r, R.drawable.robot_black));
				break;
			case RED_ROBOT:
				drawPict(c, R.drawable.robot_red, getRobotSpot(r, R.drawable.robot_red));
				break;
			default:
				rr = new Rect(r.left + 24, r.top + 31, r.left + 24 + SPAWN_SIZE, r.top + 31 + SPAWN_SIZE);
				drawSpawn(c, engine.getBoard()[i], rr);
			}
		}
	}

	private Rect getRobotSpot(Rect r, int dId) {
		return new Rect(r.left - 10, r.top - 4, r.left - 10 + lib.get(dId).getWidth(), r.top - 4
				+ lib.get(dId).getHeight());
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

	private void drawPict(Canvas c, int id, Point p) {
		Bitmap bmp = lib.get(id);
		Rect src = new Rect(0, 0, bmp.getWidth(), bmp.getHeight());
		Rect dest = new Rect(0 + p.getX(), 0 + p.getY(), bmp.getWidth() + p.getX(), bmp.getHeight() + p.getY());
		c.drawBitmap(bmp, src, dest, paint);
	}

	private void drawPict(Canvas c, int id, Rect dest) {
		Bitmap bmp = lib.get(id);
		Rect src = new Rect(0, 0, bmp.getWidth(), bmp.getHeight());
		c.drawBitmap(bmp, src, dest, paint);
	}
}