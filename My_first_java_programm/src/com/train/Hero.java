package com.train;

public class Hero  {
//	//����ʽ��������
////	private Hero() {
////	}
////	public static Hero lile=new Hero();
////	private static Hero getHero() {
////		return lile;
////	}
//	//����ʽ��������
//	private Hero() {
//	}
//	private static Hero lile;
//	public static Hero gethero() {
//		if(lile==null) {
//		lile=new Hero();}
//		return lile;
//	}
	
//��ϰ��̬
//	String name;
//	float hp;
//	private void kill(Mortal m) {
//	m.die(this);	
//	}
//	public static void main(String[] argv) {
//	Hero garen=new Hero();
//	garen.name="����";
//	ADHero ash=new ADHero();
//	ash.name="��ϣ";
//	APHero rizi=new APHero();
//	rizi.name="����";
//	ADAPHero ez=new ADAPHero();
//	ez.name="�������";
//
//	garen.kill(ash);
//	garen.kill(rizi);
//	garen.kill(ez);		
//	}
//��ϰsuper
	  public Hero(){
	        System.out.println("Hero���޲εĹ��췽�� ");
	    }
	     
	    public Hero(String name){
	        System.out.println("Hero����һ�������Ĺ��췽�� ");
	        this.name = name;
	    }
	     
	    public static void main(String[] args) {
	        new Hero();
	    }
    }

