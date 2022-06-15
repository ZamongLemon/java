package Ab2;
import Ab.method_1; // package Ab에서 main class를 로드


public class ab2_method extends method_1 {
	public static void main(String[] args) {
		method_1 at = new Ab.method_1();
		at.recall();
		method_1.name();
		method_1.main(args);
	}
}
