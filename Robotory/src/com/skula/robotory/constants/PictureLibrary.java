package com.skula.robotory.constants;

import java.util.HashMap;
import java.util.Map;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.skula.robotory.R;

public class PictureLibrary{
	private Map<Integer, Bitmap> map;
	
	@SuppressLint("UseSparseArrays")
	public PictureLibrary(Resources res){
		this.map = new HashMap<Integer, Bitmap>();		
		this.map.put(R.drawable.background, 		BitmapFactory.decodeResource(res, R.drawable.background));
		
		this.map.put(R.drawable.robot_black, 		BitmapFactory.decodeResource(res, R.drawable.robot_black));
		this.map.put(R.drawable.robot_white, 		BitmapFactory.decodeResource(res, R.drawable.robot_white));
		this.map.put(R.drawable.robot_red, 			BitmapFactory.decodeResource(res, R.drawable.robot_red));

		this.map.put(R.drawable.spawn_black, 		BitmapFactory.decodeResource(res, R.drawable.spawn_black));
		this.map.put(R.drawable.spawn_white, 		BitmapFactory.decodeResource(res, R.drawable.spawn_white));
		
		this.map.put(R.drawable.btn_bstock_p1_01,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_01));
		this.map.put(R.drawable.btn_wstock_p1_01,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_01));
		this.map.put(R.drawable.btn_bstock_p1_02,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_02));
		this.map.put(R.drawable.btn_wstock_p1_02,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_02));
		this.map.put(R.drawable.btn_bstock_p1_03,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_03));
		this.map.put(R.drawable.btn_wstock_p1_03,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_03));
		this.map.put(R.drawable.btn_bstock_p1_04,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_04));
		this.map.put(R.drawable.btn_wstock_p1_04,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_04));
		this.map.put(R.drawable.btn_bstock_p1_05,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_05));
		this.map.put(R.drawable.btn_wstock_p1_05,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_05));
		this.map.put(R.drawable.btn_bstock_p1_06,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_06));
		this.map.put(R.drawable.btn_wstock_p1_06,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_06));
		this.map.put(R.drawable.btn_bstock_p1_07,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_07));
		this.map.put(R.drawable.btn_wstock_p1_07,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_07));
		this.map.put(R.drawable.btn_bstock_p1_08,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_08));
		this.map.put(R.drawable.btn_wstock_p1_08,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_08));
		this.map.put(R.drawable.btn_bstock_p1_09,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_09));
		this.map.put(R.drawable.btn_wstock_p1_09,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_09));
		this.map.put(R.drawable.btn_bstock_p1_10,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_10));
		this.map.put(R.drawable.btn_wstock_p1_10,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_10));
		this.map.put(R.drawable.btn_bstock_p1_11,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_11));
		this.map.put(R.drawable.btn_wstock_p1_11,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_11));
		this.map.put(R.drawable.btn_bstock_p1_12,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_12));
		this.map.put(R.drawable.btn_wstock_p1_12,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_12));
		this.map.put(R.drawable.btn_bstock_p1_13,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_13));
		this.map.put(R.drawable.btn_wstock_p1_13,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_13));
		this.map.put(R.drawable.btn_bstock_p1_14,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p1_14));
		this.map.put(R.drawable.btn_wstock_p1_14,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p1_14));
		this.map.put(R.drawable.btn_bstock_p2_01,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_01));
		this.map.put(R.drawable.btn_wstock_p2_01,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_01));
		this.map.put(R.drawable.btn_bstock_p2_02,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_02));
		this.map.put(R.drawable.btn_wstock_p2_02,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_02));
		this.map.put(R.drawable.btn_bstock_p2_03,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_03));
		this.map.put(R.drawable.btn_wstock_p2_03,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_03));
		this.map.put(R.drawable.btn_bstock_p2_04,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_04));
		this.map.put(R.drawable.btn_wstock_p2_04,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_04));
		this.map.put(R.drawable.btn_bstock_p2_05,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_05));
		this.map.put(R.drawable.btn_wstock_p2_05,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_05));
		this.map.put(R.drawable.btn_bstock_p2_06,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_06));
		this.map.put(R.drawable.btn_wstock_p2_06,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_06));
		this.map.put(R.drawable.btn_bstock_p2_07,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_07));
		this.map.put(R.drawable.btn_wstock_p2_07,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_07));
		this.map.put(R.drawable.btn_bstock_p2_08,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_08));
		this.map.put(R.drawable.btn_wstock_p2_08,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_08));
		this.map.put(R.drawable.btn_bstock_p2_09,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_09));
		this.map.put(R.drawable.btn_wstock_p2_09,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_09));
		this.map.put(R.drawable.btn_bstock_p2_10,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_10));
		this.map.put(R.drawable.btn_wstock_p2_10,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_10));
		this.map.put(R.drawable.btn_bstock_p2_11,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_11));
		this.map.put(R.drawable.btn_wstock_p2_11,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_11));
		this.map.put(R.drawable.btn_bstock_p2_12,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_12));
		this.map.put(R.drawable.btn_wstock_p2_12,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_12));
		this.map.put(R.drawable.btn_bstock_p2_13,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_13));
		this.map.put(R.drawable.btn_wstock_p2_13,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_13));
		this.map.put(R.drawable.btn_bstock_p2_14,		BitmapFactory.decodeResource(res, R.drawable.btn_bstock_p2_14));
		this.map.put(R.drawable.btn_wstock_p2_14,		BitmapFactory.decodeResource(res, R.drawable.btn_wstock_p2_14));

	}
		
	public Bitmap get(int id){
		return map.get(id);
	}	
}