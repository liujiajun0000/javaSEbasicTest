import java.util.Arrays;
public class ttest1{
	public static void main(String[] args){
	String str = "统计一个字符在字符串中的所有位置";
	char z = '字';
	int[] num = {};
	for(int i = 0; i < str.length(); i++){
		char a = str.charAt(i);
		if(a == z){
			num = Arrays.copyOf(num,num.length+1);
			num[num.length-1] = i;
			}
		}System.out.print(Arrays.toString(num));
	}
}                   //练习一