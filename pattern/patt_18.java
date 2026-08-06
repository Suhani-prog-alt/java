package pattern;

public class patt_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int space = n/2;
		int star = 1;
		while(row<=n) {
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
			//mirror + next line
			if(row<=n/2) {
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			row++;
			System.out.println();
		}
	}

}
