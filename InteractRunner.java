import java.util.Scanner;

/**
	Класс для запуска калькулятора.Поддерживает ввод пользователя.
*/
public class InteractRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";		
			while(!exit.equals("yes")){
				System.out.println("Enter first arg: ");
				String fst = reader.next();
				System.out.println("Enter second arg: ");
				String snd = reader.next();
				calc.add(Integer.valueOf(fst),Integer.valueOf(snd));
				System.out.println("Result : "+ calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : yes/no ");
				exit = reader.next();
			}
		}finally{
			reader.close();
			}
	}
}