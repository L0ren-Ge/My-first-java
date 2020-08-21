package com.train;

public class Hero  {
//	//饿汉式单例方法
////	private Hero() {
////	}
////	public static Hero lile=new Hero();
////	private static Hero getHero() {
////		return lile;
////	}
//	//懒汉式单例方法
//	private Hero() {
//	}
//	private static Hero lile;
//	public static Hero gethero() {
//		if(lile==null) {
//		lile=new Hero();}
//		return lile;
//	}
	
//练习多态
//	String name;
//	float hp;
//	private void kill(Mortal m) {
//	m.die(this);	
//	}
//	public static void main(String[] argv) {
//	Hero garen=new Hero();
//	garen.name="盖伦";
//	ADHero ash=new ADHero();
//	ash.name="艾希";
//	APHero rizi=new APHero();
//	rizi.name="瑞兹";
//	ADAPHero ez=new ADAPHero();
//	ez.name="伊泽瑞尔";
//
//	garen.kill(ash);
//	garen.kill(rizi);
//	garen.kill(ez);		
//	}
//练习super
	  public Hero(){
	        System.out.println("Hero的无参的构造方法 ");
	    }
	     
	    public Hero(String name){
	        System.out.println("Hero的有一个参数的构造方法 ");
	        this.name = name;
	    }
	     
	    public static void main(String[] args) {
	        new Hero();
	    }
    }

