package com.train;
import java.util.Scanner;
public class fanzhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入循环次数：");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int a[]=new int[m];
		for(int n=0;n<a.length;n++) {
			a[n]=(int)(Math.random()*100);
		}
		System.out.println("你创建了一个"+(a.length)+"长度的数组");
        for(int i=0;i<a.length;i++) {
    	System.out.println("数组第"+i+"个值是："+a[i]);
    }
        //boolean ouShu=false;
       // if(a.length%2==0) {
       // ouShu=true;	
      //  }
      //  if(ouShu)
        int x=a.length-1;
    	int y=0;
    	int temp;
        	for(int j=1;j<=(a.length/2);j++) {            	
            	temp=a[x];
            	a[x]=a[y];
            	a[y]=temp;
            	x--;
            	y++;			
        }
        	System.out.println("【【【反转之后】】】");  	
        	 for(int i=0;i<a.length;i++) {
        	    	System.out.println("数组第"+i+"个值是："+a[i]);
        	    }
	}

}
