public class numBer{
		public static void main (String[] args){
			int x = 3;
			int y = x++ + ++x + x * 10;
			System.out.print(x);
			System.out.print(y);
		}
}