package com.skula.robotory.constants;

import java.util.HashMap;
import java.util.Map;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.skula.robotory.R;

public class PictureLibrary {
	private Map<Integer, Bitmap> map;

	@SuppressLint("UseSparseArrays")
	public PictureLibrary(Resources res) {
		this.map = new HashMap<Integer, Bitmap>();
		this.map.put(R.drawable.background, BitmapFactory.decodeResource(res, R.drawable.background));

		this.map.put(R.drawable.robot_black, BitmapFactory.decodeResource(res, R.drawable.robot_black));
		this.map.put(R.drawable.robot_white, BitmapFactory.decodeResource(res, R.drawable.robot_white));
		this.map.put(R.drawable.robot_red, BitmapFactory.decodeResource(res, R.drawable.robot_red));

		this.map.put(R.drawable.spawn_black, BitmapFactory.decodeResource(res, R.drawable.spawn_black));
		this.map.put(R.drawable.spawn_white, BitmapFactory.decodeResource(res, R.drawable.spawn_white));

		this.map.put(R.drawable.p1_defeat, BitmapFactory.decodeResource(res, R.drawable.p1_defeat));
		this.map.put(R.drawable.p2_defeat, BitmapFactory.decodeResource(res, R.drawable.p2_defeat));
		this.map.put(R.drawable.p1_victory, BitmapFactory.decodeResource(res, R.drawable.p1_victory));
		this.map.put(R.drawable.p2_victory, BitmapFactory.decodeResource(res, R.drawable.p2_victory));
		this.map.put(R.drawable.background_endgame, BitmapFactory.decodeResource(res, R.drawable.background_endgame));
		
		this.map.put(R.drawable.sel_pawn, BitmapFactory.decodeResource(res, R.drawable.sel_pawn));
		this.map.put(R.drawable.sel_robot, BitmapFactory.decodeResource(res, R.drawable.sel_robot));
	}

	public Bitmap get(int id) {
		return map.get(id);
	}
}