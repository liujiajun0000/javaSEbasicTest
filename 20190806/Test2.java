import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
	Scanner n = new Scanner(System.in);
	System.out.println("������һ������");
	int num = n.nextInt();
	if((num%5==0)&&(num%6==0)){
		System.out.println("�ܱ�5��6����");
		}else if((num%5==0)&&(num%6!=0)){
		System.out.println("�ܱ�5����");
		}else if((num%5!=0)&&(num%6==0)){
		System.out.println("�ܱ�6����");
		}else{
		System.out.println("���ܱ�5��6����");
		}
	}
}