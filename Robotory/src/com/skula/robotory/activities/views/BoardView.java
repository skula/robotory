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

public class BoardView extends View {
	private Paint paint;
	private Resources res;

	public BoardView(Context context) {
		super(context);
		this.paint = new Paint();
		this.res = context.getResources();
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
		}
		return true;
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.drawBitmap(BitmapFactory.decodeResource(res, R.drawable.background), new Rect(0, 0, 800, 1280), new Rect(0, 0, 800, 1200), paint);
	}
}
