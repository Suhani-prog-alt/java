package pattern;

public class patt_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = 0;
		int star = n;
		while(row<=2*n -1) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			
			//star
			int j = 1;
			while(j<=star) {
				System.out.print("*  ");
				j++;
			}
			//mirror
			if(row<n) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}

}
