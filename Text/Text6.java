public class Text6{
    public static void main(String[] args){
	String numbers = "692116851128";
	int oddnum = 0;
	int evennum = 0;
	for( int i = 0; i < numbers.length(); i++ ){
		if( i % 2 == 0 ){
			oddnum = oddnum + numbers.charAt(i) - 48;
		    }else{
			evennum = evennum + numbers.charAt(i) - 48;
			}
	    }
    int sumNums = oddnum + evennum*3;
	int oneNums = sumNums % 10;
	int twoNums = 10 - oneNums;
	int thrNums = twoNums % 10;
	System.out.print(thrNums);
    }
}