package com.hlh.driverlessCarPro;

/**
 * 
 * @author Administrator
 *  本来是应该定义接口的，但是接口的实现在main方法里面没法测试，所以改成了抽象类了。
 */
public abstract class Car {
	static void move (String orientation,int moveNum) {};
	static int getPositionX(int x) {return 0;};
	static int getPositionY(int y) {return 0;};
	static String getOrientation(String orientation) {return "N";};
}
