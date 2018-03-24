// ����� ��������� �����������.

public class Calculator{
	private int result;	// ��������� ����������.
	/* ��������� ���������.
	@param params ��������� ������������. */ 
	public void add(int ... params){
		for(Integer param : params){
			this.result+=param;
		}
	}
	// �������� ����������.
	public void sub(int a,int b){
		this.result=a-b;	
	}
	// ������������ ����������.
	public void pow(int a,int b){
		this.result=a*b;	
	}
	// ������� ����������.
	public void div(int a,int b){
		this.result=a/b;	
	}
	//������� �����.
	public void exp(int a,int b){
		this.result=(int)Math.pow(a,b);	
	}
	/* �������� ���������.
	@return ��������� ����������.*/
	public int getResult(){
		return this.result;
	}
	// �������� ��������� ����������.
	public void cleanResult(){
		this.result=0;
	}
	

};
