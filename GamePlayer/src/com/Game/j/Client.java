package com.Game.j;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;
import com.Game.j.GamePlayer;
/**
 * @author ljj
 * @since  2019.8.7
 */
public class Client {
	static GamePlayer[]players = {};
	static Monster[]monsters = {};
	public static void main(String[] args) {
	Welcome();
	}
	public static void Welcome() { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("这是一个RPG游戏");
		System.out.println("1.开始游戏");
		System.out.println("2.游戏规则");
		System.out.println("3.查看所有角色信息");
		System.out.println("4.根据角色名查看角色信息");
		System.out.println("5.修改角色信息");
		System.out.println("6.删除角色");
		System.out.println("7.结束游戏");
		System.out.println("8.创建怪物");
		System.out.println("9.查看所有怪物");
		System.out.println("10.开始作战（获得金币和经验）");
		System.out.println("11.兑换道具");
		System.out.println("12.查看当前时间");
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
			handle4();
			Welcome();
		}else if(num==5) {
			handle5();
			Welcome();
		}else if(num==6) {
			handle6();
			Welcome();
		}else if(num==7){
			handle7();
			Welcome();
		}else if(num==8) {
			handle8();
			Welcome();
		}else if(num==9) {
			handle9();
			Welcome();
		}else if(num==10) {
			handle10();
			Welcome();
		}else if(num==11) {
			handle11();
			Welcome();
		}else if(num==12) {
			handle12();
			Welcome();
		}
	}
	
	//1.开始游戏
	public static void handle1(){
		System.out.println("请输入您游戏角色的名字：");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String name1 = scanner.next();
		System.out.println("请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4. 矮人 5.元素) ");
		int race1 = scanner.nextInt();
		GamePlayer gp = new GamePlayer(); 
		gp.setName(name1);
		gp.setSex('男');
		gp.setProfession("战士");
		gp.setRace(race1);
		gp.setPower(random.nextInt(10000));                   
	    gp.setAgile(random.nextInt(10000));                  
	    gp.setPhysical(random.nextInt(10000));             
	    gp.setIntell(random.nextInt(10000));               
	    gp.setHealth(200);                                
	    gp.setMagicVal(150);                            
	    gp.setLevel(1);
	    gp.setMoney(0);
	    gp.setExperience(0);
		players=Arrays.copyOf(players,players.length+1);
		players[players.length-1]=gp;
		if(players!=null) {
			System.out.println("创建成功！！！");
			System.out.println("您的英雄名称为："+gp.getName());
			System.out.println("您的英雄种族为："+gp.getRace());
			System.out.println("您的英雄职业为："+gp.getProfession());
		}
	}
	
	//2.游戏规则
	public static void handle2(){
		System.out.println("游戏规则：如果玩家过分的违反游戏规则，或者对游戏环境、"
				+ "其他玩家或者游戏本身造成严重影响，我们将永久停止该账号的使用权，"
				+ "永久冻结是对账号最高级别的处罚，账号将永久失去游戏登录权限。");
	}
	
	//3.查看所有角色信息
	public static void handle3() {
		for(int i=0;i<players.length;i++) {
			System.out.println(players[i]);
		}
	}
	
	//4.根据角色名查看角色信息
	public static void handle4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要查找的角色：");
		String name = scanner.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].getName().equals(name)) {
				System.out.println(players[i]);
			}
		}
	}
	//5.修改角色信息
	public static void handle5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要查找的角色：");
		String name = scanner.next();
		System.out.println("请输入你要修改的职业为：");
		String profession = scanner.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].getName().equals(name)) {
				players[i].setProfession(profession);
				System.out.println("您修改的职业为："+profession);
			}
		}
	}
	//6.删除角色
	public static void handle6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要删除的角色：");
		String name = scanner.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].getName().equals(name)) {
			players[i] = players[players.length-1];
			players = Arrays.copyOf(players,players.length-1);
			}	
		}System.out.println("删除后的角色信息为："+Arrays.toString(players));
	}
	
	public static void handle7() {
	    System.out.println("系统退出");
	}	
	//8.创建怪物
	public static void handle8() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("您创建的怪物为：");
		String nameMon = scanner.next();
		System.out.println("您创建的怪物血量为：");
		Integer bloodMon = scanner.nextInt();
		System.out.println("您创建的怪物经验值为：");
		Integer experienceMon = scanner.nextInt();
		System.out.println("您创建的怪物掉落金币为：");
		Integer goldMon = scanner.nextInt();
		Monster mon = new Monster();
		mon.setMonName(nameMon);
		mon.setMonBlood(bloodMon);
		mon.setExperience(experienceMon);
		mon.setGold(goldMon);
		monsters = Arrays.copyOf(monsters, monsters.length+1);
		monsters[monsters.length-1]=mon;
		if(monsters!=null) {
			System.out.println("创建怪物成功!");
			System.out.println("怪物名称为"+nameMon);
			System.out.println("怪物血量为"+bloodMon);
			System.out.println("怪物经验值为"+experienceMon);
			System.out.println("怪物掉落金币为："+goldMon);
		}
	}
	//9.查看所有怪物
	public static void handle9() {
		for(int i=0;i<monsters.length;i++) {
			System.out.println(monsters[i]);
		}
	}
	//10.开始作战（获得金币和经验）
	public static void handle10() {
		BattleImpl.choosePlayer();
	}
	//11.兑换道具
	public static void handle11() {
		
	}
	//12.查看时间
	public static void handle12() {
		  Calendar c = Calendar.getInstance();
		  int year = c.get(Calendar.YEAR);
		  int month = c.get(Calendar.MONTH);
		  int day = c.get(Calendar.DAY_OF_MONTH);
		  int hour = c.get(Calendar.HOUR_OF_DAY);
		  int minute = c.get(Calendar.MINUTE);
		  int second = c.get(Calendar.SECOND);
		  System.out.println(year+"年"+month+"月"+day+"日"+" "+hour+":"+minute+":"+second);
	}
}
