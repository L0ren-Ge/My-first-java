package com.train;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[5];
    int j=1;
    a[0]=(int)(Math.random()*100);
    a[1]=(int)(Math.random()*100);
    a[2]=(int)(Math.random()*100);
    a[3]=(int)(Math.random()*100);
    a[4]=(int)(Math.random()*100);
    int minValue=a[0];
    for(int i=1;i<a.length;i++) {	
    	if(minValue>a[i]) {
    		minValue=a[i];}
    }
    System.out.println("第一个数是"+a[0]);
    System.out.println("第二个数是"+a[1]);
    System.out.println("第三个数是"+a[2]);
    System.out.println("第四个数是"+a[3]);
    System.out.println("第五个数是"+a[4]);
    System.out.println("最小的数是"+minValue); 
	}
    }


