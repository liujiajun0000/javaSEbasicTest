package com.demo;
import java.util.Random;
public class character {
	String name;                            //����
    char sex = '��';                        //�Ա� 
    String race = "human";                //����
    String  profession = "սʿ";          //ְҵ
    Random random =new Random();
    int power = random.nextInt(9999);                    //����
    int Agile = random.nextInt(9999);                   //����
    int physical = random.nextInt(9999);               //����
    int intell = random.nextInt(9999);                //����
    int health = 200;                                //����ֵ
    int magicVal = 150;                             //ħ��ֵ 
}
