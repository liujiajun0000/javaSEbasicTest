public class Study8{
	public static void main(String[] args){
	double profit = 27;
	double bonus = 0;
	if(profit >= 10){
		bonus = profit*0.1;
		}else if(profit >= 20){
			bonus = ((profit-10)*0.75)+(10*0.1);
			}
			System.out.print("发放奖金数为："+bonus+"万元！");
		}
	}