class Program9{
	
	public static void main(String[] args){
		Fibonacci n1 = new Fibonacci(10);
		Fibonacci n2 = new Fibonacci(25);
		n1.printSeries();
		n2.printSeries();
	}
}

class Fibonacci{
	int number;
	
	Fibonacci(int number){
		this.number = number;
	}
	
	public int fibo(int n){
		if(n<=1){
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
	
	public void printSeries(){
		
		for(int i=0; i<number; i++){
			System.out.print(fibo(i) + " ");
		}
		System.out.println();
	}
		
}
		