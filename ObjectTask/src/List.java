
public class List {
	private String arr[] ;
	private String arrComplete[] ; 
	private int position = 0 ; 
	private String Completearr[] ;  
	
	public void List(String Completearr[]) {
		this.Completearr = Completearr ; 
		
	}
	
	//Add task to list
	
	public void ListAdd(String arr[], String add) {
		this.arr = arr ;
		
		//Increment up to next position if position is filled already
		//arr[0] starts as null so must include in if statement
		
		if(arr[position] != null || arr[0] == null) {
			position++ ; 
		    arr[position] = add ; 
	}
	}
	
	//Display task when selecting
	public void ListSelect(int position) {
		this.position = position ; 
		System.out.println("Task: " + arr[position]) ; 
	}
	
	
	//If task is completed show that it is completed when displaying to do list
	public void Completed(String arr[], String Completearr[]) {
		this.arr = arr ; 
		for (int i =0; i < arr.length; i++) {
			if (arr[i] == Completearr[i] && arr[i] != null) {
				System.out.println(arr[i] + " Task Completed") ; 
			}
		}
}
	//Comparison for if completed or not
	public boolean Complete(int pos, String arr[], String Completearr[]) {
		if (arr[pos] == Completearr[pos]) {
			return true ; 
		}
		else
			return false ;
		
	}
	
	public void ModifyList(String arr[], String add) {
		arr[position] = add ; 
		
	}
}
	
	

