package shape;

public abstract class shape {
	protected int  a,b,c;
	protected double area =0 , primeter =0;
	
	shape(int a){
		this.a = a;
	}
	
	shape(int a,int b){
		this.a = a;
		this.b = b;
	}
	shape(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	 public double calarea() {
		 return area;
	 }
	 public double calprim() {
		
		 return primeter;
	 }
	
	

}
