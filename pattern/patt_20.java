package pattern;

public class patt_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int space1 = n/2;
		int space2 = -1;
		while(row<=n) {
			//space
			int i = 1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			//star
			System.out.print("* ");
			//space
			int j = 1;
			while(j<=space2) {
				System.out.print("  ");
				j++;
			}
			//star
			if (row == 1 || row == n) {
				
			}
			else {
				System.out.print("*");
			}
			//mirror + next line
			if(row<=n/2) {
				space1--;
				space2+=2;
			}
			else {
				space1++;
				space2-=2;
			}
			row++;
			System.out.println("");
		}
	}

}
