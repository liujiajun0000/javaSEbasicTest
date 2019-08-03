import java.util.Scanner;

public class Text3{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int x = in.nextInt();
	double y =Math.pow(x,2) - 2*x + 4;
	System.out.println(y);
	}
}