import java.util.Arrays;
public class ttest1{
	public static void main(String[] args){
	String str = "ͳ��һ���ַ����ַ����е�����λ��";
	char z = '��';
	int[] num = {};
	for(int i = 0; i < str.length(); i++){
		char a = str.charAt(i);
		if(a == z){
			num = Arrays.copyOf(num,num.length+1);
			num[num.length-1] = i;
			}
		}System.out.print(Arrays.toString(num));
	}
}                   //��ϰһ