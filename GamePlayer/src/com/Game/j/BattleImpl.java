package com.Game.j;
import java.util.Scanner;
/**
* @ClassName: BattleImpl
* @Description: 打架类
* @author ljj
* @date 2019年8月15日 下午5:58:02
*
*/
public class BattleImpl implements Battle{
	
	static Scanner scanner =new Scanner(System.in);
	static int fightPlayer;
	static int fightMon;
	
	public static void choosePlayer() {
		System.out.println("请选择人物角色");
		fightPlayer =scanner.nextInt();
		for(int i =0;i<Client.players.length;i++) {
			if(Client.players[i].getName().equals(fightPlayer)) {
				System.out.println("你选择的角色为："+fightPlayer);
			}
		}chooseMon();
	}
	
	public static void chooseMon() {
		System.out.println("请选择要挑战的BOSS");
		fightMon =scanner.nextInt();
		for(int i =0;i<Client.monsters.length;i++) {
			if(Client.monsters[i].getMonName().equals(fightMon)) {
				System.out.println("你要挑战的BOSS为："+fightMon);
			}
		}
		BattleImpl bat = new BattleImpl();
		bat.battle();
	}
		
	@Override
	public  void battle() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		if(Client.players[fightPlayer].getHealth() - Client.monsters[fightMon].getMonBlood()>0) {
			levelUp();
			getMoney();
			System.out.println("恭喜你获胜，获得了");
		}System.out.println("战斗失败，角色死亡！");
		Client.Welcome();
	}

	@Override
	public void levelUp() {
		if(Client.players[fightPlayer].getExperience()>=100) {
			
		}
		
	}

	@Override
	public void getMoney() {
		
		
	}

}
