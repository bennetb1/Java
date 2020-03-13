import java.util.Scanner ;

public class Runmain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ; 
		GeometricObject geocolor = new GeometricObject() ; 
		Triangle trianglee = new Triangle() ; 
		
		boolean filled ; 

	System.out.println("Enter the three sides of the Triangle: ") ; 
	double side1 = input.nextDouble() ; 
	double side2 = input.nextDouble() ; 
	double side3 = input.nextDouble() ; 
	
	
	System.out.println("Enter color for the triangle: ") ;
	String color = input.next() ; 
	
	System.out.println("Enter boolean(true or false) for filled or not") ; 
	filled =input.nextBoolean() ; 
	
	trianglee.setFilled(filled);
	trianglee.setside1(side1);
	trianglee.setside2(side2) ; 
	trianglee.setside3(side3); 
	trianglee.toString() ; 
	trianglee.setColor(color) ;
	
	
	System.out.println(trianglee.toString()) ;
	try {
	System.out.printf("The area is %.2f\n", trianglee.getArea()) ; 
	} 
	catch(IllegalTriangleException ex) {
		System.out.println("Error side is too great, not a real triangle") ; 
	}
	System.out.println("The perimeter is: " + trianglee.getPerimeter()) ; 
	System.out.println("Color: " + trianglee.getColor()) ;  
	System.out.println("Triangle is " + (trianglee.isFilled() ?  "filled": " not filled"));
	}
}
