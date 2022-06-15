package Ab2;

public interface home {
	int bk = 80; // 80이상은 고장으로 처리
	public void poweron();
	public void poweroff();
	public void broken(int n);
}
