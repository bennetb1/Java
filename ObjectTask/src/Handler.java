import java.util.ArrayList ; 
import java.util.Date ; 

public class Handler {
	private ArrayList<Item> arr = new ArrayList<Item>() ; 
	
	public Handler() {
		
		
	}
	
	//Add task
	public void addTask(Item item) {
		arr.add(item) ;
		
	}
	
	//Delete Task
	public void deleteTask(int itemnum) {
		arr.remove(itemnum) ; 
		
	}
	
	//Complete task
	public void Complete(int itemnum) {
		if(arr.get(itemnum).isStatus() == true) {	
		}
		else
		{
			arr.get(itemnum).setStatus(true) ; 
		}
	}
	
	//Puts date complete in array 
	public void dateFinish(int itemnum) {
		Date date = new Date() ; 
		arr.get(itemnum).setCompleted(date);
	} 
	
	public void printAll() {
		for ( Item x : arr) {
			System.out.println(x.toString()) ; 
		}	
	}
	


}
