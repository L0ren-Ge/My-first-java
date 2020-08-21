package com.train;

public class SupportOne extends Hero implements Healer {

		// TODO Auto-generated method stub

		public void heal() {
    	   System.out.println("这是一个辅助英雄");
    }
		public static void main(String[] argv) {
			SupportOne lile=new SupportOne();
			lile.heal();
		}
	}


