package ²©¿ÍÔ°;

public class ×Ö·û´®ÏàËÆ¶È {

	public static int minCost1(String str1,String str2){
		if(str1 == null || str2 == null){
			return 0;
		}
		char []chs1 = str1.toCharArray();
		char []chs2 = str2.toCharArray();
		int row = chs1.length+1;
		int col = chs2.length+1;
		int [][]dp = new int [row][col];
		for(int i=1;i<row;i++){
			dp[i][0] = i;
		}
		for(int j=1;j<col;j++){
			dp[0][j] = j;
		}
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				if(chs1[i-1] == chs2[j-1]){
					dp[i][j] = dp[i-1][j-1];
				}else{
					dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),
							dp[i-1][j-1]) + 1;
				}
			}
		}
		return dp[row-1][col-1];
	}
	public static void main(String[] args) {
		System.out.println(minCost1("abcd","egxg"));
		System.out.println(minCost1("abcd","abcf"));
		System.out.println(minCost1("abcd","fabfcf"));
	}
}
