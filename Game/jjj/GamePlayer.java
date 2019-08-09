package com.Game.jjj;
import java.util.Random;
/**
 * @author ljj
 * @since  2019.8.7
 */
public class GamePlayer {
		String name;                     //姓名 
	    char sex ;                      //性别 
	    int race;                      //种族
	    String  profession ;          //职业
		public void Property() {
	    Random random = new Random();
		int power = random.nextInt(10000);                   //力量
	    int Agile = random.nextInt(10000);                  //敏捷
	    int physical = random.nextInt(10000);              //体力
	    int intell = random.nextInt(10000);               //智力
	    int health = 200;                                //生命值
	    int magicVal = 150;                             //魔法值 
	}
}