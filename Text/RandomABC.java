import java.util.Random;

public class RandomABC{
    public static void main(String[] args){
    Random numbers = new Random();
    int letters = numbers.nextInt(26);
	int Let = letters + 65;
	char a = (char)Let;
	System.out.println(a);
	}
}