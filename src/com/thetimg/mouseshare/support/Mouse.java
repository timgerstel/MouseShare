package com.thetimg.mouseshare.support;

import java.awt.Point;
import java.awt.PointerInfo;

public class Mouse implements MouseCoordinates{
	
	private double posX;
	private double posY;
	
	public Mouse(PointerInfo pointerInfo){
		Point p = pointerInfo.getLocation();
		posX = p.getX();
		posY = p.getY();
	}

	@Override
	public double getPosX() {
		return posX;
	}

	@Override
	public double getPosY() {
		// TODO Auto-generated method stub
		return posY;
	}
	
	public boolean isOnLeftEdge(){
		return false;
	}
	
	//returns String printout of coordinates in x,y format
	public String toString(){
		String to = posX + "," + posY;
		return to;
	}

}
