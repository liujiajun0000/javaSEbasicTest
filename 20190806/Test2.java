import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
	Scanner n = new Scanner(System.in);
	System.out.println("请输入一个数：");
	int num = n.nextInt();
	if((num%5==0)&&(num%6==0)){
		System.out.println("能被5和6整除");
		}else if((num%5==0)&&(num%6!=0)){
		System.out.println("能被5整除");
		}else if((num%5!=0)&&(num%6==0)){
		System.out.println("能被6整除");
		}else{
		System.out.println("不能被5和6整除");
		}
	}
}