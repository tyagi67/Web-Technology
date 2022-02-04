class Program6{
	public static void main(String[] args){
		Factorial f = new Factorial(6);
		System.out.println("Factorial = " + f.fact());	
	}
}

class Factorial{
	int number;
	
	Factorial(int number){
		this.number = number;
	}
	
	public long fact(){
		long factorial = 1;
		for(int i=1; i<=number; i++){
			factorial *= i;
		}
		return (number >= 0 ? factorial : -1l);
	}
}