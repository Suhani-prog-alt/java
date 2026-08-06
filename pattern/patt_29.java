package pattern;

public class patt_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = n-1;
		int star = 1;
		while(row<=n) {
			//space
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			//star
			int j = 1;
			while(j<=star) {
				if(j==1 || j==star) {
					System.out.print(row+" ");
				}
				else {
					System.out.print("0 ");
				}
				j++;
			}
			//next line
			System.out.println();
			row++;
			space--;
			star+=2;
		}
	}

}
