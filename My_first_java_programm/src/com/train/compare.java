package com.train;
import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    @SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
    System.out.println("������a:");
    int a=s.nextInt();
    System.out.println("������b");
    int b=s.nextInt();
    System.out.println("�Ƚ� "+a+">"+b+(a>b));
    System.out.println("�Ƚ� "+a+">="+b+(a>=b));
    System.out.println("�Ƚ� "+a+"<"+b+(a<b));
    System.out.println("�Ƚ� "+a+"<="+b+(a<=b));
    System.out.println("�Ƚ� "+a+"=="+b+(a==b));
    System.out.println("�Ƚ� "+a+"!="+b+(a!=b));
	}

}
