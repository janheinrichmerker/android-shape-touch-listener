package com.heinrichreimersoftware.shapetouchlistener.library;

import android.view.MotionEvent;
import android.view.View;

public class OnShapeTouchListener implements View.OnTouchListener{
	private Shape shape;
	private boolean pressed;

	public OnShapeTouchListener(Shape shape){
		this.shape = shape;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event){
		switch(event.getAction()){
			case MotionEvent.ACTION_DOWN:{
				if(shape.isInShape(event.getX(), event.getY())){
					pressed = true;
					v.setPressed(true);
					return false;
				}
				else{
					pressed = false;
					v.setPressed(false);
				}
			}
			case MotionEvent.ACTION_MOVE:{
				if(shape.isInShape(event.getX(), event.getY())){
					return false;
				}
				else{
					pressed = false;
					v.setPressed(false);
				}
			}
			case MotionEvent.ACTION_UP:{
				if(pressed && shape.isInShape(event.getX(), event.getY())){
					v.performClick();
				}
				pressed = false;
				v.setPressed(false);
			}
		}
		return true;
	}
}
