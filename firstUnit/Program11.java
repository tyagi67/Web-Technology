public class Program11{
    public static void main(String[] args){
		Circle c1,c2;
		c1 = new Circle(10.0f);
		c2 = new Circle(1.0f);
		System.out.println(c1.perimeter());
		System.out.println(c1.area());
		System.out.println(c2.perimeter());
		System.out.println(c2.area());
        
    }
}

class Circle{
	float radius;
	
	Circle(float radius){
		this.radius = radius;
	}
	
	public float perimeter(){
		return ((float)(2*3.14*radius));
	}
	
	public float area(){
		return ((float)(3.14*radius*radius));
	}
}
