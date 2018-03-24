
public class ArgRunner{
	private int argument;
	//сохранить переменную.
	public void inputArg(int a){
		this.argument=a;
	}
	//получить переменную.
	public int getArg(){
		return this.argument;
	}
	// очистить переменную.
	public void cleanArg(){
		this.argument=0;
	}
}