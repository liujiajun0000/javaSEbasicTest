public class Practice2{
    public static void main(String[] args){
		int content = 180;
		int pageContent = 12;
		int page = 0;
		page = content % pageContent == 0 ? content / pageContent : content / pageContent +1;
		System.out.println(page);
	}
}