
public class ArgRunner{
	private int argument;
	//��������� ����������.
	public void inputArg(int a){
		this.argument=a;
	}
	//�������� ����������.
	public int getArg(){
		return this.argument;
	}
	// �������� ����������.
	public void cleanArg(){
		this.argument=0;
	}
}