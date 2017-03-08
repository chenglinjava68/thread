package com.jd.thread.waitNotify;

public class GodownProducer extends Thread {

	private int neednum; // 生产产品的数量

	private Godown godown; // 仓库

	GodownProducer(int neednum, Godown godown) {
		this.neednum = neednum;
		this.godown = godown;
	}

	public void run() {
		// 生产指定数量的产品
		godown.produce(neednum);
	}
}
