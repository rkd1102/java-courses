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
