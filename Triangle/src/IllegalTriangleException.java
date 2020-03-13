
	public class IllegalTriangleException extends IllegalArgumentException {
		private double side1  ;
		private double side2 ; 
		private double side3 ; 

		public void IllegalTriangleException (double side1, double side2, double side3) {
		//	super(side1,side2,side3); 
			this.side1 = side1 ; 
			this.side2 = side2 ; 
			this.side3 = side3 ; 
			
		}
		public double getside1() {
			return side1 ; 
		}
		public double getside2() {
			return side2 ; 
			
		}
		public double getside3() {
			return side3 ; 
		}
	}

