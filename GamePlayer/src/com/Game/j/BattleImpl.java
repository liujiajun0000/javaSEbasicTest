package com.Game.j;
import java.util.Scanner;
/**
* @ClassName: BattleImpl
* @Description: �����
* @author ljj
* @date 2019��8��15�� ����5:58:02
*
*/
public class BattleImpl implements Battle{
	
	static Scanner scanner =new Scanner(System.in);
	static int fightPlayer;
	static int fightMon;
	
	public static void choosePlayer() {
		System.out.println("��ѡ�������ɫ");
		fightPlayer =scanner.nextInt();
		for(int i =0;i<Client.players.length;i++) {
			if(Client.players[i].getName().equals(fightPlayer)) {
				System.out.println("��ѡ��Ľ�ɫΪ��"+fightPlayer);
			}
		}chooseMon();
	}
	
	public static void chooseMon() {
		System.out.println("��ѡ��Ҫ��ս��BOSS");
		fightMon =scanner.nextInt();
		for(int i =0;i<Client.monsters.length;i++) {
			if(Client.monsters[i].getMonName().equals(fightMon)) {
				System.out.println("��Ҫ��ս��BOSSΪ��"+fightMon);
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
			System.out.println("��ϲ���ʤ�������");
		}System.out.println("ս��ʧ�ܣ���ɫ������");
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
