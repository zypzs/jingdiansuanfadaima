package ����԰;

/**
 * ����5��Ǯһֻ��ĸ��3��Ǯһֻ��С��3ֻһ��Ǯ��
 * ��100��Ǯ��һ��ֻ��,���й�����ĸ����С��������Ҫ�У�
 * �ʹ�����ĸ����С��Ҫ�����ֻ�պô���100��Ǯ��
 */
public class ��Ǯ��ټ� {
	/**
	 * ��ͨ�ⷨ,ʱ�临�Ӷ�O(n*n)
	 */
	public static void solve1(){
		for(int i=1;i<20;i++){
			for(int j=1;j<33;j++){
				int z = 100-i-j;
				if((z%3 == 0) && 5*i+3*j+z/3 == 100){
					System.out.println("����"+i+"ֻ��ĸ��"+j+"ֻ��С��"+z+"ֻ��");
				}
			}
		}
	}
	/**
	 * ��������ѧ����
	 * x+y+z = 100(1) x*5+y*3+z/3 = 100(2)  ��(1)(2)�� 7x + 4y = 100��y = (100-7x)/4;
	 * ��x=4k;��y=25-7k,z=75+3k;����x,y,z������0���õ�k<=3
	 * @param args
	 */
	public static void solve2(){
		int x,y,z;
		for(int i=1;i<=3;i++){
		   	x=4*i;
		    y=25-7*i;
		    z=75+3*i;
		    System.out.println("����"+x+"ֻ��ĸ��"+y+"ֻ��С��"+z+"ֻ��");
		}
	}
	public static void main(String[] args) {
		solve2();
	}

}
