package com.train;

public class ADHero extends Hero implements Mortal {
////��ϰ��̬
//	@Override
//	public void die(Hero h1) {
//		// TODO Auto-generated method stub
//		 System.out.println(h1.name+"��ɱ��"+name);		
//	}
	//��ϰsuper
	   public void physicAttack() {
	        System.out.println("����������");
	    }
	     
	    public ADHero(String name){
	        super(name);
	        System.out.println("AD Hero�Ĺ��췽��");
	    }
	     
	    public static void main(String[] args) {
	        new ADHero("������");
	    }	
}
