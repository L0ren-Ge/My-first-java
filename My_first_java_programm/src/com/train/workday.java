package com.train;
import java.util.Scanner;
public class workday {
    public static void main(String [] argv) {
    Scanner s=new Scanner(System.in);
    System.out.println("������һ�����ڣ�");
    int a=s.nextInt();
    String b= a>=6?"�ڼ���":"������";	
    System.out.println("����������"+a+"����"+b);
    }
}
