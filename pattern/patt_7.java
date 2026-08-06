package pattern;

public class patt_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int m = 5;
		while(row<=n) {
			int i = 1;
			while(i<=m) {
				if (i == 1 || i == n || row == 1 || row ==n) {
					System.out.print("* ");
					i++;
				}
				else {
					System.out.print("  ");
					i++;
				}
			}
			//next line
			System.out.println();
			row++;
		}
	}

}
