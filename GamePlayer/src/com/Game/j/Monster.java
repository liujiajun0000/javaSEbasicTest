package com.Game.j;
import java.util.Random;
/**
* @ClassName: Monster
* @Description: 怪物类
* @author ljj
* @date 2019年8月15日 下午1:48:23
*
*/
public class Monster {
	private String monName;
	private Integer monBlood;
	private Integer experience;
	private Integer gold;
	public void getMoney() {
	Random random = new Random();
	 setGold(random.nextInt(200));
	 }
	@Override
	public String toString() {
		return "Monster [monName=" + monName + ", monBlood=" + monBlood + ", experience=" + experience + ", gold="
				+ gold + "]";
	}
	
	public String getMonName() {
		return monName;
	}
	public void setMonName(String monName) {
		this.monName = monName;
	}
	public Integer getMonBlood() {
		return monBlood;
	}
	public void setMonBlood(Integer monBlood) {
		this.monBlood = monBlood;
	}
	public Integer getGold() {
		return gold;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public void setGold(Integer gold) {
		this.gold = gold;
	}
	
}
