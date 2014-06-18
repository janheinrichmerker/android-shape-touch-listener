package com.heinrichreimersoftware.shapetouchlistener.library;

import android.view.View;

public class Rectangle implements Shape{
	private float x1;
	private float y1;
	private float x2;
	private float y2;

	public Rectangle(View v){
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = v.getWidth();
		this.y2 = v.getHeight();
	}

	public Rectangle(float x1, float y1, float x2, float y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public boolean isInShape(float x, float y){
		return x >= Math.min(x1, x2) && x <= Math.max(x1, x2)
				&& y >= Math.min(y1, y2) && y <= Math.max(y1, y2);
	}
}
