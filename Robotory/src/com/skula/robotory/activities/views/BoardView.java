package com.skula.robotory.activities.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import com.skula.robotory.constants.TouchArea;
import com.skula.robotory.enums.Action;
import com.skula.robotory.services.Drawer;
import com.skula.robotory.services.GameEngine;

public class BoardView extends View {
	private Paint paint;
	private Resources res;
	private Drawer drawer;
	private GameEngine ge;

	private boolean endOfGame;

	public BoardView(Context context) {
		super(context);
		this.endOfGame = false;
		this.paint = new Paint();
		this.ge = new GameEngine();
		this.res = context.getResources();
		this.drawer = new Drawer(this, ge);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		int x = (int) event.getX();
		int y = (int) event.getY();

		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			break;
		case MotionEvent.ACTION_MOVE:
			break;
		case MotionEvent.ACTION_UP:
			// on recupère l'area du clique
			if (!endOfGame) {
				int area = TouchArea.getArea(x, y);

				if (!ge.isStockEmpty()) {
					//ge.setMessage(TouchArea.getAreaLabel(x, y));

					if (ge.getAction().equals(Action.NONE) || ge.getAction().equals(Action.PICK_SPAWN)) {
						ge.setSrcArea(area);
					} else {
						ge.setDestArea(area);
					}

					if (ge.canProcess()) {
						ge.process();
						if (ge.isStockEmpty()) {
							endOfGame = true;
						} else {
							if (ge.isEndOfRound()) {
								ge.setSrcArea(TouchArea.NONE_ID);
								ge.setDestArea(TouchArea.NONE_ID);
								ge.nextPlayer();
							}
						}
					} else {
						switch (ge.getAction()) {
						case PICK_SPAWN:
							ge.setDestArea(TouchArea.NONE_ID);
							break;
						case MOVE_ROBOT:
							ge.setDestArea(TouchArea.NONE_ID);
							break;
						default:
							ge.setSrcArea(TouchArea.NONE_ID);
							ge.setDestArea(TouchArea.NONE_ID);
							ge.setAction(Action.NONE);
							break;
						}
					}
				}
			}
		}
		invalidate();
		return true;
	}

	@Override
	public void draw(Canvas canvas) {
		
		
		drawer.draw(canvas);
		if (endOfGame) {
			drawer.drawEndGame(canvas);
		}
	}
}
