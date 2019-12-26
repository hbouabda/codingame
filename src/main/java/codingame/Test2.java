package codingame;

public class Test2 {

	public static void main(String[] args) {
		String s= get(5, 5);
		System.out.println(s);
	}
	
	static String get(int l, int c) {
	    int [][] table = new int [l][c];
	    table[0][0] = 1;
		for( int i = 1; i<l ; i++){
		    table[i][0]=1;

		}
		for( int j =1; j<c ; j++){
		    table[j][j] =1;
		}
		
		for( int x = 2; x < l; x++){
		    for(int y = 2 ; y < c ; y++){
		        table[x][y]=table[x-1][x-1]+table[y-1][y-1];
		        //System.out.println(table[x][y]);
		    }
		}
		
		System.out.println(table[3][3]);
		return "0";
	}

}
