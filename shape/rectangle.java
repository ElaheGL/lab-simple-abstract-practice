package shape;

public class rectangle extends shape{
	
	public rectangle(int a ,int b) {
		super(a,b);
	}
	public double calarea() {
		area = a*b;
		return area;
	}
	 public double calprim() {
		 primeter = 2*(a+b);
		 return primeter;
	 }

}
