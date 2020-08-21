package com.train;

public class ADHero extends Hero implements Mortal {
////练习多态
//	@Override
//	public void die(Hero h1) {
//		// TODO Auto-generated method stub
//		 System.out.println(h1.name+"击杀了"+name);		
//	}
	//练习super
	   public void physicAttack() {
	        System.out.println("进行物理攻击");
	    }
	     
	    public ADHero(String name){
	        super(name);
	        System.out.println("AD Hero的构造方法");
	    }
	     
	    public static void main(String[] args) {
	        new ADHero("德莱文");
	    }	
}
