package com.skula.robotory.activities.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

import com.skula.robotory.R;
import com.skula.robotory.constants.UIArea;
import com.skula.robotory.enums.Action;
import com.skula.robotory.services.Drawer;
import com.skula.robotory.services.GameEngine;

public class BoardView extends View {
	private Paint paint;
	private Resources res;
	private Drawer drawer;
	private GameEngine ge;

	public BoardView(Context context) {
		super(context);
		this.paint = new Paint();
		this.drawer = new Drawer(res, null);
		this.res = context.getResources();
		this.ge = new GameEngine();
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
			int area = UIArea.getArea(x, y);
			
			if(ge.getAction().equals(Action.NONE)){
				ge.setSrcArea(area);
			}else{
				ge.setDestArea(area);
			}
			
			if(ge.canProcess()){
				ge.process();
			}
		}
		invalidate();
		return true;
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.drawBitmap(BitmapFactory.decodeResource(res, R.drawable.background), new Rect(0, 0, 800, 1280),
				new Rect(0, 0, 800, 1200), paint);
		drawer.draw(canvas);
	}
}
