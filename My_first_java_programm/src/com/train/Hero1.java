package com.train;

public class Hero1 {
	String name; //����
    
	float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed=1000; //�ƶ��ٶ�
    public Hero1() {
    	System.out.println("Hero1�Ĺ��췽��");
    }
    public Hero1(String name) {
    	System.out.println("��"+name+"����÷���");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hero1();
		new Hero1("����");
	}

}
