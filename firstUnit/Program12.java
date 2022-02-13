class Program12{
	public static void main(String[] args){
		ComplexNumber c1,c2;
		c1 = new ComplexNumber(2,3);
		c2 = new ComplexNumber(4,7);
		c1.display();
		c2.display();
		c1.add(c2).display();
		c1.multiply(c2).display();
	}
}

class ComplexNumber{
	int real;
	int imag;
	
	ComplexNumber(int real, int imag){
		this.real = real;
		this.imag = imag;
	}
	
	void display(){
		System.out.println("z = " + real + " + i" + imag);
	}
	
	ComplexNumber add(ComplexNumber z){
		ComplexNumber p = new ComplexNumber(0,0);
		p.real = this.real + z.real;
		p.imag = this.imag + z.imag;
		return p;
	}
	
	ComplexNumber multiply(ComplexNumber z){
		ComplexNumber p = new ComplexNumber(0,0);
		p.real = this.real * z.real - this.imag * z.imag;
		p.imag = this.real * z.imag + this.imag * z.real;
		return p;
	}
	
}