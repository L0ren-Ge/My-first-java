package com.train;

public class ADHero2 extends Hero1 {
	int moveSpeed=400; //ÒÆ¶¯ËÙ¶È
	public int getMoveSpeed(){
        return this.moveSpeed;
    }
     
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        ADHero2 h= new ADHero2();
	         
	        System.out.println(h.getMoveSpeed());
	        System.out.println(h.getMoveSpeed2());
	        
	}

}
