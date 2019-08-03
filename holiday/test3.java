public class test3{
	public static void main(String[] args){
	String n ="123456789012";
	int oddNum = 0;
	int evenNum = 0;
	for(int i = 0; i < n.length(); i++){
		if ( i % 2 == 0){
			oddNum += n.charAt(i)-48;
			}else{
			evenNum += n.charAt(i)-48;
				}
		}
		System.out.println(oddNum);
		System.out.println(evenNum);
	}
}
//×Ö·û´®Í³¼Æ

