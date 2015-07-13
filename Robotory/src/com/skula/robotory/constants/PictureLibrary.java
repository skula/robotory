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
	}
		
	public Bitmap get(int id){
		return map.get(id);
	}	
}