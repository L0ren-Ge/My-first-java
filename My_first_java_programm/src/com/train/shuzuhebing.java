package com.train;

public class shuzuhebing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[(int)(Math.random()*5+5)];
    int b[]=new int[(int)(Math.random()*5+5)];
	System.out.println("数组a的内容");
    for(int i=0;i<a.length;i++) {
    	a[i]=(int)(Math.random()*100);
    	System.out.print(a[i]+" ");
    }
	System.out.println();
	System.out.println("数组b内容");
    for(int j=0;j<b.length;j++) {
    	b[j]=(int)(Math.random()*100);
    	System.out.print(b[j]+" ");
    }
	System.out.println();
    int x[]=new int[a.length+b.length];
    System.arraycopy(a, 0, x, 0, a.length);
    System.arraycopy(b, 0, x, a.length, b.length);
    System.out.println("数组x内容");
    for(int m=0;m<x.length;m++) {
    	System.out.print(x[m]+" ");
    }
	}
}
