import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
	Scanner n = new Scanner(System.in);
	int num = n.nextInt();
	int num1 = num%10;
	int num2 = num/10%10;
	int num3 = num/100%10;
	int num4 = num/1000%10;
	int num5 = num/10000;
	int length = String.valueOf(num).length();
	System.out.println(length);
	System.out.print(num1);
	System.out.print(num2);
	System.out.print(num3);
	System.out.print(num4);
	System.out.print(num5);
	}
}