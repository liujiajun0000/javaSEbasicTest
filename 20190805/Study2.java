import java.util.Scanner;
public class Study2{
	public static void main(String[] args){
	Scanner n = new Scanner(System.in);
	System.out.print("请输入一个数：");
	int num = n.nextInt();
	int fNum = num%10;
	int sNum = num/10%10;
	int tNum = num/100;
	System.out.println(fNum+sNum+tNum);
	}
}