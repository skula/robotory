package com.skula.robotory.services;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.skula.robotory.constants.PictureLibrary;
import com.skula.robotory.constants.UIArea;

public class Drawer {
	private PictureLibrary lib;
	private Paint paint;
	private GamenEngine engine;

	public Drawer(Resources res, GamenEngine engine) {
		this.engine = engine;
		this.paint = new Paint();
		this.lib = new PictureLibrary(res);
	}

	public void draw(Canvas c) {
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
	}
}