public class Example5 {
	public static void main(String[] args) {
		/*
		 * ���� �ڵ带 ���� while������ ��ȯ 
		 * int sum=0; 
		 * int i;
		 *  for(i=1;i<12;i++) {
		 *    if(i % 2 == 0) {
		 *    sum= i+sum; }
		 *  }
		 *   System.out.println("1���� 12������ ¦���� �� = " + sum);
		 */
		int sum = 0;
		int i=1;
		while (i <= 12) {
			if (i % 2 == 0) {
				sum = i + sum;
			}
			i++;
		}
		System.out.println("1���� 12������ ¦���� �� = " + sum);
	}

}