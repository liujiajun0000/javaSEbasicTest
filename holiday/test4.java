import java.util.Arrays;
public class test4{
	public static void main(String[] args){
	int[] a = {56123};
	int[] b = Arrays.copyOf(a,a.length);
	System.out.println(Arrays.toString(b));
	}
}
//数组翻转（不会做）