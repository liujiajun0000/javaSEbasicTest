public class test12{
	public static void main(String[] args){
		int cock = 5;
		int Hens = 3;
		double chicken = 1/3;
		for(int c = 0;c <= 20; c++){
			for(int h = 0;h <=33 ; h++){
				for(int k = 0;k <= 100; k+=3 ){
					if((c+h+k==100)&&(c*5+h*3+k/3==100)){
						System.out.println("����Ĺ���������"+ c);
						System.out.println("�����ĸ��������"+ h);
						System.out.println("�����С��������"+ k);
					}
				}
			}
		}
	}	
}             //��