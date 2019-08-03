public class test5{
	public static void main(String[] args){
	for (int y = 0; y < 10 ; y++){               //一共10行
		if( y > 0 && y < 9){                        //中间空心 
			for(int x = 0; x < 10 ; x++ ){        //一共10列
				if( x == 0 || x == 9 ){              //第一列和最后一列打印*
					System.out.print("* ");
					}else if( x >= 1 && x <= 9){
					System.out.print("  ");  //空心行	
					}
				}
			}else if( y == 0 || y == 9 ){          //第一行和最后一行打印*
				for( int z = 0; z < 10 ; z++ ){
					System.out.print("* ");
				}
			}
			System.out.println("");            //换行
		}
	}
}
//空心正方形
