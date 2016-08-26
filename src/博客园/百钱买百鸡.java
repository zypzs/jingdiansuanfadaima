package 博客园;

/**
 * 公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，
 * 用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，
 * 问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。
 */
public class 百钱买百鸡 {
	/**
	 * 普通解法,时间复杂度O(n*n)
	 */
	public static void solve1(){
		for(int i=1;i<20;i++){
			for(int j=1;j<33;j++){
				int z = 100-i-j;
				if((z%3 == 0) && 5*i+3*j+z/3 == 100){
					System.out.println("公鸡"+i+"只；母鸡"+j+"只；小鸡"+z+"只；");
				}
			}
		}
	}
	/**
	 * 先利用数学化简
	 * x+y+z = 100(1) x*5+y*3+z/3 = 100(2)  由(1)(2)得 7x + 4y = 100；y = (100-7x)/4;
	 * 令x=4k;则y=25-7k,z=75+3k;由于x,y,z均大于0，得到k<=3
	 * @param args
	 */
	public static void solve2(){
		int x,y,z;
		for(int i=1;i<=3;i++){
		   	x=4*i;
		    y=25-7*i;
		    z=75+3*i;
		    System.out.println("公鸡"+x+"只；母鸡"+y+"只；小鸡"+z+"只；");
		}
	}
	public static void main(String[] args) {
		solve2();
	}

}
