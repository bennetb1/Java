import java.util.* ;
public class Triangle extends GeometricObject {
	private double side1 = 1.0 ;
	private double side2 = 1.0 ;
	private double side3 = 1.0 ; 
	
	
	public void Triangle(double side1, double side2, double side3) 	throws IllegalTriangleException {
		this.side1 = side1 ; 
		this.side2 = side2 ; 
		this.side3 = side3 ; 
		if ((side1 + side2 < side3) || (side1 + side3 < side2) || (side2 + side3 < side1)) {
			throw new IllegalArgumentException("side to great") ;
		}
		}
	

	public void setside1(double side1) throws IllegalTriangleException{
		this.side1 = side1 ;
		
	}
	public void setside2(double side2) throws IllegalTriangleException {
		this.side2 = side2 ; 
		
	}
	public void setside3(double side3) throws IllegalTriangleException {
		this.side3 = side3 ; 
	}
	public double getArea() {
		double s = 0.0 ; 
		s = (side1+side2+side3) /2 ;
		return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3)) ; 
	}
	public double getPerimeter() {
		return side1 + side2 + side3 ; 
		
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}


	}

	

