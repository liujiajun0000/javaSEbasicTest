import java.util.Arrays; 
public class test1{
	public static void main(String[] args){
	String n = "ͳ��һ���ַ����ַ����е�����λ��";
	char z = '��';
	int[] count = count(n,z);
    System.out.println(Arrays.toString(count));
	}
	public static int [] count(String n,char z){
	int[] count = {};
	for(int i = 0; i < n.length(); i++){
		char a = n.charAt(i);
	if( a == z){
		count = Arrays.copyOf(count,count.length+1);
		count[count.length - 1] = i ;
			}
		}
		return count; 
	}
}
//��ϰһ