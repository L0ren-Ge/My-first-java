package com.train;

public class SupportOne extends Hero implements Healer {

		// TODO Auto-generated method stub

		public void heal() {
    	   System.out.println("����һ������Ӣ��");
    }
		public static void main(String[] argv) {
			SupportOne lile=new SupportOne();
			lile.heal();
		}
	}


