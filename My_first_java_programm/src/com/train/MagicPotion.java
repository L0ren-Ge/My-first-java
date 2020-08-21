package com.train;
//练习方法的重写
public class MagicPotion extends Item{
    public void effect() {
    	System.out.println("蓝瓶使用后，可以回魔法");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicPotion magic = new MagicPotion();
		magic.effect();
		Item item1=new Item();
		item1.effect();
	}

}
