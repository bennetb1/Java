import java.util.Calendar ;
import java.util.Date ;

public class Datee  extends List { 
	
		private String dateCreate[] = new String[1000] ; 
		private String dateFinish[] = new String[1000] ; 

		Calendar datee = Calendar.getInstance();
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis()) ;
		java.sql.Date startdate ; 
		java.sql.Date finishdate ; 
		
	//Get current date
	public String Datee() { 
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis()) ;  
		
		return date.toString() ; 
	}
		//When task was created 
		public void displaycreate(int position){
	  	System.out.println("Date Created: ") ; 
	  	
	  	startdate = date ; 
	  	
	  	//So in order that the date printed out doesn't change as the day does it
	  	//gets the current date then stores in an array at a position which the user will give
	  	//and the date can't be changed if already the position is occupied 
	  	
	  	if(dateCreate[position] == null) {
	  	dateCreate[position] = startdate.toString() ;
	  	System.out.println(dateCreate[position]) ; 
	  	}
	  	else
	  		System.out.println(dateCreate[position]) ; 

	  	
	  }
		
		//When task was finished
		public void displayfinish(int position)  {
			
			finishdate = date ; 
					
			System.out.println("Date Completed: ") ; 
			
			if(dateFinish[position] == null) {
			dateFinish[position] = finishdate.toString() ; 
			
			System.out.println(dateFinish[position]) ; 
		}
			else
				System.out.println(dateFinish[position]) ; 
	}
}


