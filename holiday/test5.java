public class test5{
	public static void main(String[] args){
	for (int y = 0; y < 10 ; y++){               //һ��10��
		if( y > 0 && y < 9){                        //�м���� 
			for(int x = 0; x < 10 ; x++ ){        //һ��10��
				if( x == 0 || x == 9 ){              //��һ�к����һ�д�ӡ*
					System.out.print("* ");
					}else if( x >= 1 && x <= 9){
					System.out.print("  ");  //������	
					}
				}
			}else if( y == 0 || y == 9 ){          //��һ�к����һ�д�ӡ*
				for( int z = 0; z < 10 ; z++ ){
					System.out.print("* ");
				}
			}
			System.out.println("");            //����
		}
	}
}
//����������
