package com.train;

public class erweishuzu {
//�ҵ�д��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[][]=new int[5][5];
    System.out.println("�����ֵ��");
    System.out.println();
    //���鸳ֵ
    for(int i=0;i<a.length;i++) {
        if(i>0)
    	System.out.println();
    	for(int j=0;j<a[0].length;j++) {
    	a[i][j]=(int)(Math.random()*100);
        System.out.print(a[i][j]+" ") ;
    	}
    }
    //����Ƚ�
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
        System.out.println("���ֵΪ��"+temp) ;
        System.out.println("���ֵ���±�Ϊ��"+(x+1)+"��"+(y+1)+"��") ;        
        }
//��׼��
//	public static void main(String[] args) {
//        int a[][] = new int[5][5];
//        // ��ʼ���������
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = (int) (Math.random() * 100);
//            }
//        }
//        // ��ӡ�����������ݣ�
//        for (int[] row : a) {
//            for (int each : row) {
//                System.out.print(each + "\t");
//            }
//            System.out.println();
//        }
// 
//        int max = -1;// ���ֵ
//        // ���ֵ������
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
//        System.out.println("�ҳ���������:" + max);
//        System.out.println("��������[" + target_i + "][" + target_j + "]");
// 
//    }
	}
	
