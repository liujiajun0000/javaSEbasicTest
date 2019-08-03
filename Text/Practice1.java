import java.util.Scanner;
public class Practice1{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int score = a.nextInt();
		if (score > 100 || score < 0){
		System.out.println("super man");
		}else if(score >= 90 && score <= 100){
		System.out.println("优秀");
		}else if(score >= 80 && score<90){
		System.out.println("良好");
	    }else if(score < 80){
		System.out.println("不及格");
		}
	}
}