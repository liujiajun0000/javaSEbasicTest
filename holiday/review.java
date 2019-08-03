public class review{
    public static void main(String[] args){
	String n ="692116851128";
    int oddNum = 0;
	int evenNum = 0;
	for(int i = 0;i < n.length(); i++){
		if( i % 2 == 0){
			oddNum = oddNum + n.charAt(i) - 48;
			}else{
			evenNum = evenNum + n.charAt(i) - 48;
			}
	}
		int sum = oddNum + evenNum*3;
		int a = sum % 10;
		int b = 10 - a;
		int c = b %10;
	   System.out.println(c);
	}
}