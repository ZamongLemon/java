
public class Switch_loop {

	public static void main(String[] args) {
		
		//case �ȿ� �ݺ����� ���� ��밡�� ���� ������ �������� ����ص� �����ϸ�, case ���� �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ������ �����ϴ�.
		//��, case�� �ϳ��� ������ ������� ������ case�� ���� �۵����� �ʽ��ϴ�.
		String sign ="*";
		int total;
		switch(sign){
			case "+" ->{ 
				total = 0;
				for (int f = 1 ; f<=5;f++) {
					total +=f;
				}
			}
			case "-" ->{
				total =0;
			}
			case "*" ->{
				total = 1;
				int k =1;
				do {
					total*=k;
					k++;
				}while(k<6);
			}
			case "/" ->{
				total = 0;
			}
			default ->{
				total =1;
			}
		}
		System.out.println("�� ���� �� : " + total );
		
	}

}
