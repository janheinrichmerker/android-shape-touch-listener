package com.heinrichreimersoftware.shapetouchlistener.library;

import android.view.View;

public class Circle implements Shape{
	private float circleCenterX;
	private float circleCenterY;
	private float circleRadiusX;
	private float circleRadiusY;

	public Circle(View v){
		this.circleCenterX = (float) v.getWidth() / 2;
		this.circleCenterY = (float) v.getHeight() / 2;
		this.circleRadiusX = (float) v.getWidth() / 2;
		this.circleRadiusY = (float) v.getHeight() / 2;
	}

	public Circle(float circleCenterX, float circleCenterY, float circleRadius){
		this.circleCenterX = circleCenterX;
		this.circleCenterY = circleCenterY;
		this.circleRadiusX = circleRadius;
		this.circleRadiusY = circleRadius;
	}

	public Circle(float circleCenterX, float circleCenterY, float circleRadiusX, float circleRadiusY){
		this.circleCenterX = circleCenterX;
		this.circleCenterY = circleCenterY;
		this.circleRadiusX = circleRadiusX;
		this.circleRadiusY = circleRadiusY;
	}

	@Override
	public boolean isInShape(float x, float y){
		return (Math.pow(x - circleCenterX, 2) / Math.pow(circleRadiusX, 2))
				+ (Math.pow(y - circleCenterY, 2) / Math.pow(circleRadiusY, 2))
				<= 1;
	}
}
