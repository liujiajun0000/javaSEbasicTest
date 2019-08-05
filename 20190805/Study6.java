public class Study6{
	public static void main(String[] args){
	int sum = 0;
	int num = 1;
	while(num<=100){
		if(num%2!=0){
			sum += num;
			num++;
			}else{
				num++;
				continue;
			}
		}System.out.print(sum);
	}
}                        //ÆæÊýÏà¼Ó