
public class ArgRunner{
	private int argument;
	//��������� ����������.
	public int inputArg(int a){
		return this.argument=a;
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