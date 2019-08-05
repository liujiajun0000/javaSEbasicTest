public class Study10{
	public static void main(String[] args){
	int salary = 30000;
	int sum = 0;
	for(int i=0;i<=10;i++){
		sum = sum +salary;
		salary +=salary*0.06;
		}System.out.println("十年后的年薪为："+salary);
		System.out.println("十年总收入："+sum);
	}
}            