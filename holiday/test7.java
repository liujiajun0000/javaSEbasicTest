public class test7{
	public static void main(String[] args){
	for (int i = 100;i < 1000; i++){
		int one = i/100;
		int two = i/10%10;
		int three = i%10;
		if (one*one*one+two*two*two+three*three*three == i){
			System.out.println(i);
			}
		}
	}
}
//Ë®ÏÉ»¨