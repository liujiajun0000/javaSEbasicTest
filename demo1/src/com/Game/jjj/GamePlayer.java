package com.Game.jjj;
import java.util.Random;
/**
 * @author ljj
 * @since  2019.8.7
 */
public class GamePlayer {
		String name;                     //���� 
	    char sex ;                      //�Ա� 
	    int race;                      //����
	    String  profession ;          //ְҵ
		public void Property() {
	    Random random = new Random();
		int power = random.nextInt(10000);                   //����
	    int Agile = random.nextInt(10000);                  //����
	    int physical = random.nextInt(10000);              //����
	    int intell = random.nextInt(10000);               //����
	    int health = 200;                                //����ֵ
	    int magicVal = 150;                             //ħ��ֵ 
	}
}