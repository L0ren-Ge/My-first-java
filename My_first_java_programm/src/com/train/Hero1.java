package com.train;

public class Hero1 {
	String name; //姓名
    
	float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed=1000; //移动速度
    public Hero1() {
    	System.out.println("Hero1的构造方法");
    }
    public Hero1(String name) {
    	System.out.println("是"+name+"想调用方法");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hero1();
		new Hero1("刘能");
	}

}
