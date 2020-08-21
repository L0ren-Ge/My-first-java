package com.train;

public class ADHero1 extends Hero1 {
    public ADHero1() {
    	System.out.println("ADHero1的构造方法");
    }
    public ADHero1(String name) {
    	//super(name);
    	System.out.println("ADHero1的构造方法");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //new ADHero1();
     new ADHero1("刘能");
	}
//不使用super关键字那么参数传递不过去，super的可以简单看成父类
}
