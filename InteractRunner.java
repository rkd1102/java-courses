import java.io.*;
import java.util.*;

/**
	Класс для запуска калькулятора.Поддерживает ввод пользователя.
*/
public class InteractRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		InputStreamReader in = new InputStreamReader(System.in);
		String fst = "";
		try{
			Calculator calc = new Calculator();
			ArgRunner argm = new ArgRunner();
			String exit = "no";		
			String contn = "no";
			while(!exit.equals("yes")){
				if (contn.equals("yes")){
				  	fst = Integer.toString(argm.getArg());
				}else{
					argm.cleanArg();
 					System.out.println("Enter first arg: ");
					fst = reader.next();
				}
				System.out.println("Enter second arg: ");
				String snd = reader.next();
				System.out.println("Enter operator(+-*/^): ");
				String s = reader.next();
        			char[] chars = s.toCharArray();
				switch(chars[0]){
				    case '+' :
					calc.add(Integer.valueOf(fst),Integer.valueOf(snd));
				        break; 
				    case '-' :
					calc.sub(Integer.valueOf(fst),Integer.valueOf(snd));
		       			break; 
			            case '*' :	
					calc.pow(Integer.valueOf(fst),Integer.valueOf(snd));
		  		        break; 
				    case '/' :
					calc.div(Integer.valueOf(fst),Integer.valueOf(snd));
				        break; 	
		    		    case '^' :
					calc.exp(Integer.valueOf(fst),Integer.valueOf(snd));
				       break; 	
				}
  				System.out.println("Result : "+ calc.getResult());
				argm.inputArg(calc.getResult());
				calc.cleanResult();
				System.out.println("Exit : yes/no ");
				exit = reader.next();
				if(exit.equals("no")){	
					System.out.println("Do you want continue older result? : yes/no ");
					contn = reader.next();
					exit = "";
					}
			}
		}finally{
			reader.close();
			}
	}
}