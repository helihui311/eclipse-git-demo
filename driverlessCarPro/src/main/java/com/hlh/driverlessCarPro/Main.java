package com.hlh.driverlessCarPro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("请选择并输入你要走的方向：E,S,W,N");
		Scanner scan = new Scanner(System.in);
		String  orientation = scan.nextLine().intern();
		System.out.println("请输入你要走几步：");
		int moveNum = scan.nextInt();
		CarImp.move(orientation,moveNum);
		scan.close();
	}
}
