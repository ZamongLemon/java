import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scan_color = new Scanner(System.in);
		System.out.println("����,��Ȳ,���,�ʷ� ���� �ϳ��� �Է��Ͻʽÿ�.");
		String color = scan_color.next();
		
		switch(color) {
		case "����"->color = "red";
		case "��Ȳ"->color = "orange";
		case "���"->color = "yellow";
		case "�ʷ�"->color = "green";
		default -> color = "�ش� �ܾ�� ������ ���� �ʽ��ϴ�.";
		}
		System.out.println(color);
		scan_color.close();
		
	}

}
