public class test8{
	public static void main(String[] args){
	for(int i = 0; i <= 1000; i++){
		int sum = 0;
		for(int k = 0; k < i; k++){
			if( i % k == 0){
				sum = sum + k;
			}
				if(sum == i){
					System.out.print(i+"");
					}
					System.out.println(k);
			}
		}
	}
}                             //ÔªÊý