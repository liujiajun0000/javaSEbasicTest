import java.util.Scanner;
public class Test1{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("������һ������");
	int num = scanner.nextInt();
	if(num%2==0){
		System.out.print("����Ϊż��");
		}else{
		System.out.print("����Ϊ����");	
		}
	}
}