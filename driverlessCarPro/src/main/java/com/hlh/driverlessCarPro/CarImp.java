package com.hlh.driverlessCarPro;

import java.util.LinkedList;

public class CarImp extends Car {
    //定义一个全局的LinkedList用来保存位置信息，让位置能够连续起来。
	static LinkedList<Position> positionList = new LinkedList<Position>();
	static boolean flag = true;
	
	public static void move(String orientation, int moveNum) {
		//初始化位置
		Position position = new Position(1,1,"N");
		positionList.add(position);
		
		int x = position.getX();
		int y = position.getY();
		
		int nextY = y;
		int nextX = x;
		
		//N向北就是y+; S向南就是y-; E向东x+; W向西x-; 
		if(orientation == "N") {
			nextY+=moveNum;
		}else if(orientation == "S") {
			nextY-=moveNum;
		}else if(orientation == "W") {
			nextX-=moveNum;
		}else if(orientation == "E") {
			nextX+=moveNum;
		}
		
		
		Position nextposition = new Position();
		if(nextY <= CarPark.yLenth && nextY >= 1) {
			nextposition.setY(nextY);
		}else {
			positionList.removeLast();
			flag = false;
			//这里相当于抛出异常。。。
			System.out.println("超出了停车线了，不能再走了...");
		};
		
        if(nextX <= CarPark.xLenth && nextX >= 1) {
        	nextposition.setX(nextX);
		}else {
			positionList.removeLast();
			flag = false;
			//这里相当于抛出异常。。。
			System.out.println("超出了停车线了，不能再走了...");
		};
		
		if(flag) {
			nextposition.setOrientation(orientation);
			positionList.add(nextposition);
			int size = positionList.size()-2;
			
			Position lastPrePosition = positionList.get(size);
			int lastX = lastPrePosition.getX();
			int lastY =  lastPrePosition.getY();
			String  lastOrientation = position.getOrientation();
			
			System.out.println("original position X = "+lastX+" and Y = "+lastY+" and facing "
			     +lastOrientation+"; Then the car turns to " + orientation+"; Now the car's position X = "+nextX+" and Y = "+nextY);
		}
				

	}
	public static int getPositionX(int x) {
		return positionList.getLast().getX();
	}

	public static int getPositionY(int y) {
		return positionList.getLast().getY();
	}

	public static String getOrientation(String orientation) {
		return positionList.getLast().getOrientation();
	}
}
