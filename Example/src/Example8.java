import java.util.Arrays;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 	���� ����� ���� ���� ���α׷��� ��û�Ͽ����ϴ�. 
		 	����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 	"1~46 �� ������ ���ڸ� �Է��� �ּ���." 
		 	����ڰ� �Է��� 5�����ڸ� �迭�� ����. main ó��
		 	
		 	�ܺ� class�� �̿��Ͽ� PC�� ���� ��÷��ȣ 5���� �̾Ƴ��ϴ�.
		 	PC�� ���� ���ڸ� �迭�� ����. �ܺ� class method�� ����
		 	������ ��� method�� �ϳ� �� �����Ͽ� ����ڰ� �Է��� 5���� �迭�����Ϳ� PC�� ���� �迭 �����͸� �ش� method�� �����Ͽ� ���
		 	
		 	��, ��� ����ϴ� �ݺ����� ������ do while������ �ۼ�
		 */

		Scanner scan_num = new Scanner(System.in);
		int num[] = new int[5];
		int i = 0;
		do {
			System.out.println("1~46 �� ������ ���ڸ� �Է��� �ּ���.");
			num[i] = scan_num.nextInt();
			i++;
		}while(i<5);
		lottery lotto = new lottery();
		lotto.setLotto(num);
		lotto = null;
		scan_num.close();
	}
}
class lottery{
	int[] numbers = new int[5];
	void setLotto(int[] choosed_Numbers) {
		makeNumbers();
		printNumbers(choosed_Numbers);
	}
	void makeNumbers() {
		int i=0;
		do {
			numbers[i] = (int)(Math.random()*46)+1;
			i++;
		}while(i<5);		
	}	
	void printNumbers(int[] choosed_Numbers) {
		System.out.println("����ڰ� �� ���� : "+ Arrays.toString(choosed_Numbers));
		System.out.println("PC�� ���� ���� : "+ Arrays.toString(numbers));		
	}
}
