import java.util.Scanner;
public class Text2{
    public static void main(String[] args){
		System.out.println("请输入你的工资：");
    Scanner scanner = new Scanner(System.in);
	double firstSalary = scanner.nextDouble();
	double tax = 0;
	double salary = firstSalary - 5000;
	double finalSalary = 0;
	if(salary <= 0){
		finalSalary = firstSalary;
	}else if(salary <= 1000){
		tax = 0.05;
	    finalSalary = firstSalary - salary*tax;
	}else if(salary <=3000){
		tax = 0.1;
		finalSalary = firstSalary - salary*tax;
	}
	System.out.println(finalSalary);
	}
}