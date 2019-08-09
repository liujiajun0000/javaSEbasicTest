package com.Game.jjj;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author ljj
 * @since  2019.8.7
 */
public class Client {
	public static void main(String[] args) {
	Welcome();
	GamePlayer a = new GamePlayer();
	a.Property();	
	}
	public static void Welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("这是一个RPG游戏");
		System.out.println("1.开始游戏");
		System.out.println("2.游戏规则");
		System.out.println("3.查看角色信息");
		System.out.println("4.根据角色名查看角色信息");
		System.out.println("5.修改角色信息");
		System.out.println("6.删除角色");
		System.out.println("7.结束游戏");
		System.out.println("请输入您想进行的操作：(1~3)");
		int num = scanner.nextInt();
		if(num==1) {
			handle1();
			Welcome();
		}else if(num==2) {
			handle2();
			Welcome();
		}else if(num==3) {
			handle3();
			Welcome();
		}else if(num==4) {
			
		}
	}
	
	
	
	
	public static void handle1(){
		System.out.println("请输入您游戏角色的名字：");
		Scanner scanner = new Scanner(System.in);
		String name1 = scanner.next();
		System.out.println("请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4. 矮人 5.元素) ");
		int race1 = scanner.nextInt();
		GamePlayer[]players = {};
		GamePlayer gp = new GamePlayer(); 
		gp.name = name1;
		gp.sex = '男';
		gp.profession = "战士";
		gp.race = race1;
		GamePlayer[]player=Arrays.copyOf(players,players.length+1);
		player[player.length-1]=gp;
		if(player!=null) {
			System.out.println("创建成功！！！");
		}
	}
	public static void handle2(){
		System.out.println("游戏规则：如果玩家过分的违反游戏规则，或者对游戏环境、"
				+ "其他玩家或者游戏本身造成严重影响，我们将永久停止该账号的使用权，"
				+ "永久冻结是对账号最高级别的处罚，账号将永久失去游戏登录权限。");
	}
	public static void handle3() {

	}
	public static void handle4() {
		
	}
}
