package com.train;
//��ϰ��������д
public class MagicPotion extends Item{
    public void effect() {
    	System.out.println("��ƿʹ�ú󣬿��Ի�ħ��");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicPotion magic = new MagicPotion();
		magic.effect();
		Item item1=new Item();
		item1.effect();
	}

}
