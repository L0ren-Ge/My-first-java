package com.train;

public class erweishuzu {
//我的写法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[][]=new int[5][5];
    System.out.println("数组的值是");
    System.out.println();
    //数组赋值
    for(int i=0;i<a.length;i++) {
        if(i>0)
    	System.out.println();
    	for(int j=0;j<a[0].length;j++) {
    	a[i][j]=(int)(Math.random()*100);
        System.out.print(a[i][j]+" ") ;
    	}
    }
    //数组比较
    	int temp=a[0][0];
    	int x = 0;
    	int y = 0;
        for(int m=0;m<a.length;m++) {
        	for(int n=0;n<a[0].length;n++) {
        	if (a[m][n]>temp) {
        		temp=a[m][n];
        		x=m;
        		y=n;   		
        	}
        	}   	
    }
        System.out.println() ;
        System.out.println("最大值为："+temp) ;
        System.out.println("最大值的下标为："+(x+1)+"行"+(y+1)+"列") ;        
        }
//标准答案
//	public static void main(String[] args) {
//        int a[][] = new int[5][5];
//        // 初始化这个数组
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = (int) (Math.random() * 100);
//            }
//        }
//        // 打印这个数组的内容：
//        for (int[] row : a) {
//            for (int each : row) {
//                System.out.print(each + "\t");
//            }
//            System.out.println();
//        }
// 
//        int max = -1;// 最大值
//        // 最大值的坐标
//        int target_i = -1;
//        int target_j = -1;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (a[i][j] > max) {
//                    max = a[i][j];
//                    target_i = i;
//                    target_j = j;
//                }
//            }
//        }
// 
//        System.out.println("找出来最大的是:" + max);
//        System.out.println("其坐标是[" + target_i + "][" + target_j + "]");
// 
//    }
	}
	
