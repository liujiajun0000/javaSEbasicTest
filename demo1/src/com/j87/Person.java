package com.j87;
/**
 * @author ljj
 * @since  2019.8.7
 */
public class Person {
    int num;              //编号
	String name;          //姓名
	char sex;             //性别
	int age;              //年龄
	boolean marry;        //婚否
	int card;             //身份证
	String add;           //地址
	int tel;              //电话
	String couple;        //伴侣
	public  Person(int num,String name,char sex,int age,boolean marry,
			int card,String add,int tel,String couple) {
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.marry = marry;
		this.card = card;
		this.add = add;
		this.tel = tel;
		this.couple = couple;
	}
		
		public boolean toMarry(Person other) {
			//男大于22岁，女小于20岁，性别不同，未婚
			if(this.age>=(this.sex=='男'?22:20)&&other.age>=(other.sex=='女'?20:22)) {
				if(this.sex!=other.sex) {
					if(this.marry==false&&other.marry==false) {
						this.marry = true;
						other.marry = true;
						this.couple = other.name;
						other.couple = this.name;
						return true;
					}
				}
			}return false;
		}
		
	public static void main(String[] args) {
			Person p = new Person(01,"张丹",'男',23,false,
					1568954236,"天津",155765484,null);
			Person p1 = new Person(02,"狄安娜",'女',21,false,
					156895436,"天津",15576584,null);
			boolean goMarry = p.toMarry(p1);
			System.out.println(goMarry);
		}
}
	

