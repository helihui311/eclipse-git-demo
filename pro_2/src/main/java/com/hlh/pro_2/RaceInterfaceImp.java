package com.hlh.pro_2;

/**
 * 在一个长800M的操场上，A B两个人在同一个地点，同时同方向出发，A的速度是40米/分钟，B的速度是60米/分钟，两个人都是每走200米休息两分钟
	请问，B比A多走一圈追上A需要多少时间 （结果保留两位小数即可）
 * @author Administrator
 *  
 *  不好意思这个做不出来！！
 */
public class RaceInterfaceImp implements RaceInterface {
	public static final int RESTTIME = 2;
	public static final int RESTMETER = 200;

	public void race(RunnerA a, RunnerB b, PlayGround p) {

		 p = new PlayGround(800);
		 a = new RunnerA(40);
		 b = new RunnerB(60);

	}

}
