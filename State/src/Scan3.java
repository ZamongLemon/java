import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("���ϴ� ���ڸ� �Է��ϼ���");
		int num = input.nextInt();
		
		// %�� ���� �����鼭 ������ ���� Ȯ���ϴ� ����
		if(num%2 ==0){
			System.out.println("¦���Դϴ�");
		}else{
			System.out.println("Ȧ���Դϴ�");
		}
		
		input.close();
	}
}
