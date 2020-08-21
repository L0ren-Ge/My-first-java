package com.train;
import java.util.Scanner;
public class workday {
    public static void main(String [] argv) {
    Scanner s=new Scanner(System.in);
    System.out.println("请输入一个日期：");
    int a=s.nextInt();
    String b= a>=6?"节假日":"工作日";	
    System.out.println("今天是星期"+a+"，是"+b);
    }
}
