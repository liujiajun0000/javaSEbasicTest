import java.util.Arrays;
public class Sort1{
	public static void main(String[] args){
	int[] nums = {54,57,11,96,83,66};
	int[] newNum = sort(nums);
	System.out.print(Arrays.toString(newNum));
	}
	public static int[] sort(int[] num){
		for(int i = 0;i < num.length-1; i++){
			for(int j = 0; j < num.length-1-i;j++){
				if(num[j] > num[j+1]){
					int a =  num[j];
					num[j] = num[j+1];	
					num[j+1] = a;
				}
			}
		}return num;
	}
}