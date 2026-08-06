package pattern;

public class patt_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 5;
		while(row<=n) {
			//star
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			
			//next line
			System.out.println();
			row++;
			star--;
		}
	}

}
