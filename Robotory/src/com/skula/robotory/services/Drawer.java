package com.skula.robotory.services;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.method.Touch;

import com.skula.robotory.R;
import com.skula.robotory.activities.views.BoardView;
import com.skula.robotory.constants.Cnst;
import com.skula.robotory.constants.DrawAreas;
import com.skula.robotory.constants.PictureLibrary;
import com.skula.robotory.constants.TouchArea;
import com.skula.robotory.enums.Action;
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
		drawPlayersStock(c);
		// drawTouchArea(c);
		
		paint.setTextSize(40f);
		if(engine.getToken()==0){
			int cx = measuredWidth / 2;
			int cy = measuredHeight / 2;
			c.save();
			c.rotate(180, DrawAreas.P1_TURN.getX(), DrawAreas.P1_TURN.getY());
			c.drawText("A vous de jouer !", DrawAreas.P1_TURN.getX(), DrawAreas.P1_TURN.getY(), paint);
			c.restore();
		}else{
			c.drawText("A vous de jouer !", DrawAreas.P2_TURN.getX(), DrawAreas.P2_TURN.getY(), paint);
		}
	}

	private void drawText(Canvas c, Paint paint, boolean reverse, String txt, Point p) {
		Typeface plain = Typeface.createFromAsset(assetManager, "fonts/OCRASTD.OTF");
		paint.setTypeface(plain);
		paint.setTextSize(60f);
		if (reverse) {
			int cx = measuredWidth / 2;
			int cy = measuredHeight / 2;
			c.save();
			c.rotate(180, p.getX(), p.getY());
			c.drawText(txt, cx + p.getX(), cy + p.getY(), paint);
			c.restore();
		} else {
			c.drawText(txt, p.getX(), p.getY(), paint);
		}
	}

	private void drawStockButtons(Canvas c) {
		paint.setColor(Color.WHITE);
		if (engine.getBlackSpawnleft() < 10) {
			Point p = DrawAreas.P1_BLACK_PAWN.clone(-25, 0);
			drawText(c, paint, true, engine.getBlackSpawnleft() + "", p);
		} else {
			drawText(c, paint, true, engine.getBlackSpawnleft() + "", DrawAreas.P1_BLACK_PAWN);
		}
		if (engine.getBlackSpawnleft() < 10) {
			Point p = DrawAreas.P2_BLACK_PAWN.clone(25, 0);
			drawText(c, paint, false, engine.getBlackSpawnleft() + "", p);
		} else {
			drawText(c, paint, false, engine.getBlackSpawnleft() + "", DrawAreas.P2_BLACK_PAWN);
		}

		paint.setColor(Color.BLACK);
		if (engine.getWhiteSpawnleft() < 10) {
			Point p = DrawAreas.P1_WHITE_PAWN.clone(-25, 0);
			drawText(c, paint, true, engine.getWhiteSpawnleft() + "", p);
		} else {
			drawText(c, paint, true, engine.getWhiteSpawnleft() + "", DrawAreas.P1_WHITE_PAWN);
		}
		if (engine.getWhiteSpawnleft() < 10) {
			Point p = DrawAreas.P2_WHITE_PAWN.clone(25, 0);
			drawText(c, paint, false, engine.getWhiteSpawnleft() + "", p);
		} else {
			drawText(c, paint, false, engine.getWhiteSpawnleft() + "", DrawAreas.P2_WHITE_PAWN);
		}
	}

	public void drawEndGame(Canvas c) {
		drawPict(c, R.drawable.background_endgame, DrawAreas.BOARD);
		Typeface plain = Typeface.createFromAsset(assetManager, "fonts/OCRASTD.OTF");
		paint.setTypeface(plain);
		paint.setTextSize(100f);
		Point p = new Point(900,650);
		
		int cx = measuredWidth / 2;
		int cy = measuredHeight / 2;
		c.save();
		c.rotate(180, p.getX(), p.getY());
		if (engine.getWinner() == 0) {
			paint.setColor(Color.GREEN);
			c.drawText("Victoire", cx + p.getX(), cy + p.getY(), paint);
		}else{
			paint.setColor(Color.RED);
			c.drawText("D�faite", p.getX(), p.getY(), paint);
		}
		
		c.restore();
		p = new Point(350,1200);
		if (engine.getWinner() == 0) {
			paint.setColor(Color.RED);
			c.drawText("D�faite", cx + p.getX(), cy + p.getY(), paint);
		}else{
			paint.setColor(Color.GREEN);
			c.drawText("Victoire", p.getX(), p.getY(), paint);
		}
	}

	private void drawTouchArea(Canvas c) {
		paint.setColor(Color.RED);
		paint.setStyle(Paint.Style.STROKE);
		c.drawRect(TouchArea.TILE_1, paint);
		c.drawRect(TouchArea.TILE_2, paint);
		c.drawRect(TouchArea.TILE_3, paint);
		c.drawRect(TouchArea.TILE_4, paint);
		c.drawRect(TouchArea.TILE_5, paint);
		c.drawRect(TouchArea.TILE_6, paint);
		c.drawRect(TouchArea.TILE_7, paint);
		c.drawRect(TouchArea.TILE_8, paint);
		c.drawRect(TouchArea.TILE_9, paint);
		c.drawRect(TouchArea.TILE_10, paint);
		c.drawRect(TouchArea.TILE_11, paint);
		c.drawRect(TouchArea.TILE_12, paint);
		c.drawRect(TouchArea.TILE_13, paint);
		c.drawRect(TouchArea.TILE_14, paint);
		c.drawRect(TouchArea.TILE_15, paint);
		c.drawRect(TouchArea.TILE_16, paint);
		c.drawRect(TouchArea.TILE_17, paint);
		c.drawRect(TouchArea.TILE_18, paint);
		c.drawRect(TouchArea.TILE_19, paint);
		c.drawRect(TouchArea.TILE_20, paint);
		c.drawRect(TouchArea.TILE_21, paint);
		c.drawRect(TouchArea.TILE_22, paint);
		c.drawRect(TouchArea.TILE_23, paint);
		c.drawRect(TouchArea.TILE_24, paint);

		paint.setColor(Color.BLUE);
		c.drawRect(TouchArea.PLAYER1_STOCK_1, paint);
		c.drawRect(TouchArea.PLAYER1_STOCK_2, paint);
		c.drawRect(TouchArea.PLAYER1_STOCK_3, paint);
		c.drawRect(TouchArea.PLAYER1_STOCK_4, paint);
		c.drawRect(TouchArea.PLAYER2_STOCK_1, paint);
		c.drawRect(TouchArea.PLAYER2_STOCK_2, paint);
		c.drawRect(TouchArea.PLAYER2_STOCK_3, paint);
		c.drawRect(TouchArea.PLAYER2_STOCK_4, paint);

		paint.setColor(Color.BLUE);
		c.drawRect(TouchArea.PLAYER1_STOCK_BLACK, paint);
		c.drawRect(TouchArea.PLAYER1_STOCK_WHITE, paint);
		c.drawRect(TouchArea.PLAYER2_STOCK_BLACK, paint);
		c.drawRect(TouchArea.PLAYER2_STOCK_WHITE, paint);
	}

	private void drawBackground(Canvas c) {
		drawPict(c, R.drawable.background, DrawAreas.BOARD);
	}

	private void drawBoard(Canvas c) {
		Rect r = null;
		for (int i = 0; i < Cnst.TILES_COUNT; i++) {
			r = TouchArea.getArea(i);
			Rect rr = null;
			switch (engine.getBoard()[i]) {
			case WHITE_ROBOT:
				if(engine.getAction().equals(Action.MOVE_ROBOT)){
					if(engine.getBoard()[engine.getSrcArea()] == Item.WHITE_ROBOT){
						Point p = new Point(r.left -30, r.top -12);
						drawPict(c, R.drawable.sel_robot, p);
					}
				}
				drawPict(c, R.drawable.robot_white, getRobotSpot(r, R.drawable.robot_white));
				break;
			case BLACK_ROBOT:
				if(engine.getAction().equals(Action.MOVE_ROBOT)){
					if(engine.getBoard()[engine.getSrcArea()] == Item.BLACK_ROBOT){
						Point p = new Point(r.left -30, r.top -12);
						drawPict(c, R.drawable.sel_robot, p);
					}
				}
				drawPict(c, R.drawable.robot_black, getRobotSpot(r, R.drawable.robot_black));
				break;
			case RED_ROBOT:
				if(engine.getAction().equals(Action.MOVE_ROBOT)){
					if(engine.getBoard()[engine.getSrcArea()] == Item.RED_ROBOT){
						Point p = new Point(r.left -30, r.top -12);
						drawPict(c, R.drawable.sel_robot, p);
					}
				}
				drawPict(c, R.drawable.robot_red, getRobotSpot(r, R.drawable.robot_red));
				break;
			case NONE:
				break;
			default:
				rr = new Rect(r.left + 35, r.top + 35, r.left + 35 + SPAWN_SIZE, r.top + 35 + SPAWN_SIZE);
				drawPict(c, getPawnDrawId(engine.getBoard()[i]), rr);
			}
		}
	}

	private Rect getRobotSpot(Rect r, int dId) {
		return new Rect(r.left - 25, r.top - 25, r.left - 25 + lib.get(dId).getWidth(), r.top
				+ lib.get(dId).getHeight() - 25);
	}

	private int getPawnDrawId(Item i) {
		if (i == Item.WHITE_SPAWN) {
			return R.drawable.spawn_white;
		} else {
			return R.drawable.spawn_black;
		}
	}

	private void drawPlayersStock(Canvas c) {
		// player 1
		drawPlayersStockSel(c, TouchArea.PLAYER1_STOCK_1, TouchArea.PLAYER1_STOCK_1_ID);
		drawStockPawn(c, engine.getStock(0)[0], TouchArea.PLAYER1_STOCK_1);
		drawPlayersStockSel(c, TouchArea.PLAYER1_STOCK_2, TouchArea.PLAYER1_STOCK_2_ID);
		drawStockPawn(c, engine.getStock(0)[1], TouchArea.PLAYER1_STOCK_2);
		drawPlayersStockSel(c, TouchArea.PLAYER1_STOCK_3, TouchArea.PLAYER1_STOCK_3_ID);
		drawStockPawn(c, engine.getStock(0)[2], TouchArea.PLAYER1_STOCK_3);
		drawPlayersStockSel(c, TouchArea.PLAYER1_STOCK_4, TouchArea.PLAYER1_STOCK_4_ID);
		drawStockPawn(c, engine.getStock(0)[3], TouchArea.PLAYER1_STOCK_4);
		// player 2
		drawPlayersStockSel(c, TouchArea.PLAYER2_STOCK_1, TouchArea.PLAYER2_STOCK_1_ID);
		drawStockPawn(c, engine.getStock(1)[0], TouchArea.PLAYER2_STOCK_1);
		drawPlayersStockSel(c, TouchArea.PLAYER2_STOCK_2, TouchArea.PLAYER2_STOCK_2_ID);
		drawStockPawn(c, engine.getStock(1)[1], TouchArea.PLAYER2_STOCK_2);
		drawPlayersStockSel(c, TouchArea.PLAYER2_STOCK_3, TouchArea.PLAYER2_STOCK_3_ID);
		drawStockPawn(c, engine.getStock(1)[2], TouchArea.PLAYER2_STOCK_3);
		drawPlayersStockSel(c, TouchArea.PLAYER2_STOCK_4, TouchArea.PLAYER2_STOCK_4_ID);
		drawStockPawn(c, engine.getStock(1)[3], TouchArea.PLAYER2_STOCK_4);
	}

	private void drawPlayersStockSel(Canvas c, Rect r, int id) {
		if(engine.getAction()==Action.PUT_SPAWN && engine.getSrcArea() == id){
			Point p = new Point(r.left - 18, r.top -17);
			drawPict(c, R.drawable.sel_pawn, p);
		}
	}
	
	private void drawStockPawn(Canvas c, Item i, Rect r) {
		if (i != Item.NONE) {
			Rect tmp = new Rect(r.left + 10, r.top + 10, r.left + SPAWN_SIZE + 10, r.top + SPAWN_SIZE + 10);
			drawPict(c, getPawnDrawId(i), tmp);
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