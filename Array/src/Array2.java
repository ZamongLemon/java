
public class Array2 {

	public static void main(String[] args) {
		//hong kim park
		String name[] = {"hong","kim","park","lee","jang","jung"};
		//System.out.println(name[4]);
//		int word = name[4].length();
	//	System.out.println(word);
		/*
		 * �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�. �ش� �迭���� ����� id 4���̻� ����Ͻÿ�
		 */
		
		for(int i = 0 ; i < name.length ; i++) {// �迭�� ���� �ľ�
			if(name[i].length()>3) {// �ܾ��� ���� �ľ�
				System.out.println(name[i]);
			}
		}
		
		/*
		 	15 60 11 14 27
		*/
		int num[] = {15, 60 , 11 , 14, 27};
		int k =0,sum=0;
		while(k<num.length) {
			sum+=num[k];
			k++;
		}
		System.out.println("�迭 ���� �� : "+ sum);
	}

}
