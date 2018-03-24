// класс реализует калькулятор.

public class Calculator{
	private int result;	// результат вычисления.
	/* суммируем аргументы.
	@param params Аргументы суммирования. */ 
	public void add(int ... params){
		for(Integer param : params){
			this.result+=param;
		}
	}
	// разность аргументов.
	public void sub(int a,int b){
		this.result=a-b;	
	}
	// перемножение аргументов.
	public void pow(int a,int b){
		this.result=a*b;	
	}
	// деление аргументов.
	public void div(int a,int b){
		this.result=a/b;	
	}
	//степень числа.
	public void exp(int a,int b){
		this.result=(int)Math.pow(a,b);	
	}
	/* получить результат.
	@return результат вычисления.*/
	public int getResult(){
		return this.result;
	}
	// очистить результат вычисления.
	public void cleanResult(){
		this.result=0;
	}
	

};
