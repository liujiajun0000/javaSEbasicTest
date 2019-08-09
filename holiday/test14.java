import java.util.Scanner;
public class test14{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int firstNum = number/1000;
		int secondNum = number/100%10;
		int thirdNum = number/10%10;
		int forthNum = number%10;
		int firstNum1 = (firstNum + 5)%10;
		int secondNum1 = (secondNum + 5)%10;
		int thirdNum1 = (thirdNum + 5)%10;
		int forthNum1 = (forthNum + 5)%10;
		int result = forthNum1*1000+thirdNum1*100+secondNum1*10+firstNum1;
		System.out.println(result);
		}
}                     //加密数据 题目16