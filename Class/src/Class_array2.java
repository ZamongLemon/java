import java.util.Random;
//import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("0~10���� ���ڸ� �ϳ� �����ϼ���;");
//		int num = sc.nextInt();
		
		//memories m = new memories();
		memories m = new memories();
//		m.ms(num);
		m = null; // �ش� �ν��Ͻ��� ���
		m = new memories();
		m.rd();
	}

}
class memories {
	public void ms(int num) {
		//���� �޼ҵ� ���� Math.random() �⺻�ڷ����� double
//		double a =Math.random();
		int b = (int)(Math.random()*10);//0~10 double -> int ����	
		if(num==b) {
			System.out.println("��÷");
		}else{
			System.out.println("���� ��ȸ��");
		}
		
		
	}
	
	public void rd() {
		System.out.println("test2");
		Random r = new Random(); // random ��ü ���� �� �ν��Ͻ� ��
		int w = 0;
		while(w<6) {
			System.out.println(r.nextInt(45)+1); // 0~9���� r.nextint ���
			w++;			
		}
		
	}
	
}
