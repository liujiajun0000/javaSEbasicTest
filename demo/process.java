package com.demo;

import java.util.Scanner;

public class process {
	public process(){
	System.out.println("这是一个RPG游戏");
	System.out.println("1.开始游戏？");
	System.out.println("2.游戏规则");
	System.out.println("3.结束游戏");
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入您想进行的操作（1-3）？");
	int num = scanner.nextInt();
	if(num == 1) {
		System.out.println("请输入您游戏角色的姓名？");
		String name = scanner.next();
		System.out.println("请输入游戏角色的种族：？1.人类2.精灵3.兽人4.矮人5.元素");
		int nums = scanner.nextInt();
			if(nums==1) {
				System.out.println("您的选择为人类？");
			}else if(nums==2) {
				System.out.println("您的选择为精灵？");
			}else if(nums==3) {
				System.out.println("您的选择为兽人？");
			}else if(nums==4) {
				System.out.println("您的选择为矮人？");
			}else if(nums==5) {
				System.out.println("您的选择为元素？");
			}
			System.out.println("创建成功！！~");
	}else if(num==2){
		System.out.println("游戏规则：多次违规者，官方将保留对账号永久冻结的权力");
	}else if(num==3) {
		System.out.println("系统退出");
	}
}
}


	
