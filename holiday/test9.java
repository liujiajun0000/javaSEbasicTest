public class test9{
	public static void main(String[] args){
	double changeHigh = 100;
	double sumHigh = 100;
	for(int i = 0; i < 10 ; i++){
		changeHigh = changeHigh / 2;
		sumHigh = sumHigh + changeHigh*2;		
		}
	System.out.println("第十次落地时，共经过"+sumHigh+"米");
	System.out.println("第十次反弹为"+changeHigh+"米");
	}
}                //小球反弹