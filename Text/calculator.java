import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
		int a = sumNum();
		System.out.println("���Ϊ��" + a);
	}
	public static int sumNum(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������һ����");
		int b = scanner.nextInt();
		System.out.println("������ڶ�����");
		int c = scanner.nextInt();
		int result = b * c;
		return result;
		}
	}