package com.j811;
 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
* @ClassName: StudentManager
* @Description:ѧ������ϵͳ 
* @author ljj
* @date 2019��8��11�� ����11:53:43
*
*/
public class StudentManager {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Start();
	}
	//ѧ����Ϣ�洢
	static ArrayList<Student> students = new ArrayList<Student>();
	private static String name1;
	//��ʼ����
	public static void Start() {
		System.out.println("----------��ӭ ��½ѧ�� ��Ϣ����ϵͳ----------");
		System.out.println("1.��¼        2.�˳�");
		System.out.println("��ѡ��");
		int num = scanner.nextInt();
		if(num==1) {
			login();
		}else if(num==2) {
			System.out.println("ϵͳ�˳���");
		}else {
			System.out.println("���������룡");
		}
	}
	//��½����
	public static void login() {
		System.out.println("��ӭ��¼��");
		String userName = "admin";
		String passWord = "admin";
		System.out.println("�������û�����");
		String name = scanner.next();
		System.out.println("���������룺");
		String pass = scanner.next();
		if(name.equals(userName) && pass.equals(passWord)) {
			System.out.println("��½�ɹ�");
			System.out.println("��ӭ����admin");
			handle();
		}else {
			System.out.println("��¼ʧ�ܣ�������");
			login();
		}
	}
	//ѧ����Ϣ��������
	public static void handle() {
		System.out.println("********************��ѡ��Ҫ��������Ϣ��Ӧ����********************");
		System.out.println("*1.�鿴ѧ����Ϣ     2.���ѧ����Ϣ      3.ɾ��ѧ����Ϣ      4.�޸�ѧ����Ϣ      5.�˳� *");
		System.out.println("��ѡ��");
		int num = scanner.nextInt();
		if(num==2) {
			add();
			handle();
		}else if(num==1) {
			view();
			handle();
		}else if(num==3) {
			delete();
			handle();
		}else if(num==4) {
			revise();
			handle();
		}else if(num==5) {}
		System.out.println("ϵͳ�˳���");
	}
	//���ѧ����Ϣ
	public static void add() {
		System.out.println("������ѧ��id��");
		int id = scanner.nextInt();
		System.out.println("������ѧ��������");
		String name = scanner.next();
		System.out.println("������ѧ���Ա�");
		char sex = scanner.next().charAt(0);
		System.out.println("������ѧ�����䣺");
		int age = scanner.nextInt();
		System.out.println("������ѧ�������꼶����ֻ�ܳ������м����߼���");
		String grade = scanner.next();
		System.out.println("������ѧ����ַ��");
		String address = scanner.next();
		System.out.println("������ѧ����ϵ��ʽ��");
		long tel = scanner.nextLong();
		System.out.println("������ѧ���������䣺");
		String email = scanner.next();
		Student stu = new Student();
		//����ѧ��
		stu.id = id;
		stu.name = name;
		stu.sex = sex;
		stu.age = age;
		stu.grade = grade;
		stu.address = address;
		stu.tel = tel;
		stu.email = email;
		//��ѧ����Ϣ����洢����
		students.add(stu);
		if(students !=null) {
			System.out.println("ѧ����Ϣ¼��ɹ���");
		}
	}
	
	//�鿴ѧ����Ϣ
	public static void view() {
			System.out.println(students);
		}
	//ɾ��ѧ����Ϣ
	public static void delete() {
		System.out.println("��������Ҫɾ����ѧ��������");
		String name1 = scanner.next();
		for(int i=0;i<students.size();i++) {
			if(students.get(i).name.equals(name1)) {
				students.remove(i);
				System.out.println("ɾ���ɹ�!"); 
				return;
			}
		}System.out.println("ɾ��ʧ�ܣ�");
	}
	//�޸�ѧ����Ϣ
	public static void revise() {
		System.out.println("��������Ҫ�޸ĵ�ѧ��������");
		String name = scanner.next();
		System.out.println("��������Ҫ�޸ĵ�����Ϊ��"); 
		String age= scanner.next();
		System.out.println("��������Ҫ�޸ĵ��꼶Ϊ��(ֻ�ܳ������м����߼�)"); 
		String grade =scanner.next();
		System.out.println("��������Ҫ�޸ĵĵ�ַΪ��"); 
		String address=scanner.next();
		System.out.println("��������Ҫ�޸ĵ���ϵ��ʽΪ��"); 
		long tel=scanner.nextLong();
		System.out.println("��������Ҫ�޸ĵĵ�������Ϊ��"); 
		String email=scanner.next();
		System.out.println("�޸ĺ����ϢΪ��");
		for(int i=0;i<students.size();i++) {
			if(students.get(i).name.equals(name)) {
				//students.set(i,age);
			}
		}
	}
}
