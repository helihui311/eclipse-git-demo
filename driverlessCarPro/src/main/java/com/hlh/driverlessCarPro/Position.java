package com.hlh.driverlessCarPro;

public class Position {
	 
	 public int x = 1;
	 public int y = 1;
	 public String orientation = "N";
	
	 public Position() {
		 
	 }
     public Position(int x, int y, String orientation) {
    	this.x = x;
    	this.y = y;
    	this.orientation = orientation;
     }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
     
}
