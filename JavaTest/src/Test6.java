
public class Test6 {
	public static void main (String[] args) {
		int d = 2, g = 1;
		do {
			do {
				System.out.println(d+" * "+g+" = "+d*g);		
				
				g++;
			}while(g<10);
			d++;
			g=1;
		}while(d<10);
	}

}
