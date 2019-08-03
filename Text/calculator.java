import java.util.Scanner;
public class calculator{
	public static void main(String[] args){
		int a = sumNum();
		System.out.println("结果为：" + a);
	}
	public static int sumNum(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int b = scanner.nextInt();
		System.out.println("请输入第二个数");
		int c = scanner.nextInt();
		int result = b * c;
		return result;
		}
	}