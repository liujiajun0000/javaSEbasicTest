package com.demo;
import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
	Scanner n = new Scanner(System.in);
	System.out.println("�������·ݣ�");
	int num = n.nextInt();
	for(int i = 1; i<=num; i++) {
		System.out.print("���ӵ�"+i+"���µ�����Ϊ"+a(i));
		}
	}
	public static int a(int m){
		if(m==1 || m==2) {
			return 2;
		}else {
			return a(m-1)+a(m-2);
		}
	}
}

