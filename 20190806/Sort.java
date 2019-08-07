import java.util.Arrays;
public class Sort{
	public static void main(String[] args){
	int[] nums ={51,94,75,32,15,17};
    	for(int i = 0;i < nums.length-1; i++){
			for(int j = i + 1;j < nums.length; j++){
				if(nums[i] > nums[j]){
					int a = nums[i];
					nums[i] = nums[j];
					nums[j] = a;
				}
			}
		}System.out.print(Arrays.toString(nums));
	}
}                  //—°‘Ò≈≈–Ú