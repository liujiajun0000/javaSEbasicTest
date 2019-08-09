package com.demo;
import java.util.Random;
public class character {
	String name;                            //姓名
    char sex = '男';                        //性别 
    String race = "human";                //种族
    String  profession = "战士";          //职业
    Random random =new Random();
    int power = random.nextInt(9999);                    //力量
    int Agile = random.nextInt(9999);                   //敏捷
    int physical = random.nextInt(9999);               //体力
    int intell = random.nextInt(9999);                //智力
    int health = 200;                                //生命值
    int magicVal = 150;                             //魔法值 
}
