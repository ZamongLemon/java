import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt1 {

	/*
	 *  GUI mode  : AWT(abstract window ����Ʋ),SWING(AWT-�׷���)
	 *  CUI mode  : Scanner (X)
	 *  SWING : JFrame -> JPanel -> JObject
	 *  
	 */
	public static void main(String[] args) {
		//AWT �������
		// Frame -> Panel -> Object (����)
		// Object -> Panel -> Frame(����)

		Frame fr = new Frame();
		fr.setTitle("����� �α���");//â �̸�
		fr.setSize(500, 500);//â ũ��
		fr.setVisible(true); //��� ��/��
		popclose pc = new popclose();
		fr.addWindowListener(pc);
		Panel pa = new Panel();//�г�
		
		
		CheckboxGroup radio = new CheckboxGroup();//�׷켳��

		TextField id = new TextField(10);
		TextField pw = new TextField(10);//10�ڱ���
		TextField sa = new TextField("�����ȣ�� �Է��ϼ���");//������ �̸� �����
		Button b1 = new Button("�α���");//������Ʈ
		Checkbox c1 = new Checkbox("�ڵ� �α���");
		Checkbox c2 = new Checkbox("������",true,radio);
		Checkbox c3 = new Checkbox("���Ǿ���",false,radio);
		
		
		pa.add(c3);
		pa.add(c2);
		pa.add(c1);
		pa.add(sa);
		pa.add(id);
		pa.add(pw);
		pa.add(b1);//add �߰�

		fr.add(pa);//�г� > ������

	}

}


class popclose extends WindowAdapter{
	public void windowClosing(WindowEvent event_) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		System.gc();
	}
}