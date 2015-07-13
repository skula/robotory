package com.skula.robotory.services;

import android.content.res.Resources;
import android.graphics.Paint;

import com.skula.robotory.constants.PictureLibrary;

public class Drawer {
	private PictureLibrary lib;
	private Paint paint;
	private GamenEngine engine;

	public Drawer(Resources res, GamenEngine engine) {
		this.engine = engine;
		this.paint = new Paint();
		this.lib = new PictureLibrary(res);
	}
}