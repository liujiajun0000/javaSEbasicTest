package com.Game.j;
import java.util.Random;
/**
 * @author ljj
 * @since  2019.8.7
 */
public class GamePlayer {
		private String name;                      //姓名 
		private char sex ;                       //性别 
		private int race;                       //种族
		private String  profession ;           //职业
		private int level;					  //等级
		private int money;                   //金币
		private int experience;             //经验值
		private int power;                 //力量
		private int agile;                //敏捷
		private int physical;            //体力
		private int intell;             //智力
		private int health;            //生命值
		private int magicVal;         //魔法值 
		@Override
		public String toString() {
			return "GamePlayer [name=" + name + ", sex=" + sex + ", race=" + race + ", profession=" + profession
					+ ", level=" + level + ", money=" + money + ", experience=" + experience + ", power=" + power
					+ ", agile=" + agile + ", physical=" + physical + ", intell=" + intell + ", health=" + health
					+ ", magicVal=" + magicVal + "]";
		}
		
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public char getSex() {
			return sex;
		}
		public void setSex(char sex) {
			this.sex = sex;
		}
		public int getRace() {
			return race;
		}
		public void setRace(int race) {
			this.race = race;
		}
		public String getProfession() {
			return profession;
		}
		public void setProfession(String profession) {
			this.profession = profession;
		}
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		public int getPower() {
			return power;
		}
		public void setPower(int power) {
			this.power = power;
		}
		public int getAgile() {
			return agile;
		}
		public void setAgile(int agile) {
			this.agile = agile;
		}
		public int getPhysical() {
			return physical;
		}
		public void setPhysical(int physical) {
			this.physical = physical;
		}
		public int getIntell() {
			return intell;
		}
		public void setIntell(int intell) {
			this.intell = intell;
		}
		public int getHealth() {
			return health;
		}
		public void setHealth(int health) {
			this.health = health;
		}
		public int getMagicVal() {
			return magicVal;
		}
		public void setMagicVal(int magicVal) {
			this.magicVal = magicVal;
		}
}