public class Calculate{
  	public static void main(String[] arg){
		System.out.println("Calculate...");
		int fst = Integer.valueOf(arg[0]);
		int snd = Integer.valueOf(arg[2]);
		Calculate tmp = new Calculate();
		switch(arg[1]){
		    case "+" :
			System.out.println("sum: "+ tmp.summ(fst,snd));
		       break; 
		    case "-" :
			System.out.println("sub: "+ tmp.sub(fst,snd));		      
		       break; 
	            case "pow" :	
			System.out.println("mult: "+ tmp.mult(fst,snd));
		       break; 
		    case "div" :
			System.out.println("div: "+ tmp.div(fst,snd));		      
		       break; 	
    		    case "exp" :
			System.out.println("exp: "+ tmp.exp(fst,snd));		      
		       break; 	

		}

	}
	public int summ(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}
	public int mult(int a, int b){
		return a*b;
	}
	public double div(int a, int b){
		return (double)a/b;
	}
	public double exp(int a, int b){
		return Math.pow(a,b);
	}



};