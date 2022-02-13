class Program15{
	public static void main(String[] args){
		CompileTimePoly obj = new CompileTimePoly();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(2, 3, 4));
		System.out.println(obj.add(2.0, 4.0));
		System.out.println(obj.add(2, 3l));
	}
}

class CompileTimePoly{
	
	int add(int a, int b){
		System.out.println("Method 1");
		return a+b;
	}
	
	//changing arguments
	int add(int a, int b, int c){
		return a+b+c;
	}
	
	//changing datatypes
	double add(double a, double b){
		return a+b;
	}
	
	long add(long a, long b){
		System.out.println("Method 4");
		return a+b;
	}
}