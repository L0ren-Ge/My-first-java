package com.train;

public class ADHero1 extends Hero1 {
    public ADHero1() {
    	System.out.println("ADHero1�Ĺ��췽��");
    }
    public ADHero1(String name) {
    	//super(name);
    	System.out.println("ADHero1�Ĺ��췽��");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //new ADHero1();
     new ADHero1("����");
	}
//��ʹ��super�ؼ�����ô�������ݲ���ȥ��super�Ŀ��Լ򵥿��ɸ���
}
