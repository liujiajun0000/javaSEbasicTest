import java.util.Scanner;
public class Test4{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.print("请输入一个数：");
	long num = s.nextInt();
	long k = 1;
	for(long i = 1;i <= num; i++){
		k = k*i;
		}System.out.print("阶乘为："+k);
	}
}                             //阶乘