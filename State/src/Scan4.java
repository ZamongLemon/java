import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("�Է��� ������ �����ּ���");
		//String memo =a.next(); //next(): �����̽� �� �Է� ������ ����
		String memo = a.nextLine();//nextLine() �����̽��� ���� ��� �Է� ���� 
		System.out.println(memo);
		
		a.close(); //scanner ����	
		
		String name = "park"; //string+���� = %s
		int age = 25; // ������ %d �Ҽ��� %f
		// date,time %t
		// boolean %b
		//System.out.println(name+"���� ���̴� "+age+"�Դϴ�.");
		//printf: f -> format
		System.out.printf("%s���� ���̴� %d�Դϴ�.",name,age);

	}

}
