import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 	�迭���� �⺻Ŭ���� �޼ҵ� ����
		 	����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�.
		 	"�н� �л� �̸��� �Է��� �ּ���."
		 	�迭 ������ 5��
		 	������ �޼ҵ忡�� �ش� ����� �Է°��� �迭�� �����Ͽ� ���.
		 	
		 */	
		Scanner scan_name = new Scanner(System.in);
		int e=0;String name ="";String list_name="";
		while(e<5){
			System.out.println("�б� �л� �̸��� �Է����ּ���.");
			name =scan_name.next();
			list_name+=name+" ";
			e++;
		}
		getName(list_name);
		scan_name.close();
	}
	
		
	public static void getName(String student) {
	
		String userin[] = student.split(" ");		
		System.out.println(Arrays.toString(userin));
		
	}
	static String[] lists = new String[5];

}
