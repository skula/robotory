package com.skula.robotory.constants;

import java.util.HashMap;
import java.util.Map;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.skula.robotory.R;

public class PictureLibrary{
	private Map<Integer, Bitmap> map;
	
	public PictureLibrary(Resources res){
		this.map = new HashMap<Integer, Bitmap>();		
		this.map.put(R.drawable.background, 		BitmapFactory.decodeResource(res, R.drawable.background));
		
		this.map.put(R.drawable.robot_black, 		BitmapFactory.decodeResource(res, R.drawable.robot_black));
		this.map.put(R.drawable.robot_white, 		BitmapFactory.decodeResource(res, R.drawable.robot_white));
		this.map.put(R.drawable.robot_red, 			BitmapFactory.decodeResource(res, R.drawable.robot_red));

		this.map.put(R.drawable.spawn_black, 		BitmapFactory.decodeResource(res, R.drawable.spawn_black));
		this.map.put(R.drawable.spawn_white, 		BitmapFactory.decodeResource(res, R.drawable.spawn_white));
	}
		
	public Bitmap get(int id){
		return map.get(id);
	}	
}