package com.j87;
/**
 * @author ljj
 * @since  2019.8.7
 */
public class Person {
    int num;              //���
	String name;          //����
	char sex;             //�Ա�
	int age;              //����
	boolean marry;        //���
	int card;             //���֤
	String add;           //��ַ
	int tel;              //�绰
	String couple;        //����
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
			//�д���22�꣬ŮС��20�꣬�Ա�ͬ��δ��
			if(this.age>=(this.sex=='��'?22:20)&&other.age>=(other.sex=='Ů'?20:22)) {
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
			Person p = new Person(01,"�ŵ�",'��',23,false,
					1568954236,"���",155765484,null);
			Person p1 = new Person(02,"�Ұ���",'Ů',21,false,
					156895436,"���",15576584,null);
			boolean goMarry = p.toMarry(p1);
			System.out.println(goMarry);
		}
}
	

