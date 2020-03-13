import java.util.* ;

public class ToDo {
	public static Scanner keyboard ; 
	public static void main(String[] args) {
		
		Handler handle = new Handler() ;
		
		keyboard = new Scanner(System.in) ;
		Display display = new Display() ; 
		
		
		Item item = new Item() ;
		
		int option = 0 ;
		//Keep program going unless 5 is entered
		while(option != 5) {
			display.Display() ; 
		 option = keyboard.nextInt() ; 
		 keyboard.nextLine() ; 
		switch(option) {
			//Print tasks
			case 1:
				handle.printAll(); 
				break ; 
				
			case 2:
				//Add task
				add(handle) ; 
				break ;
				
			case 3:
				//Remove task
				remove(handle) ; 
				break;
			
			case 4:
				complete(handle) ; 
				break;
			
			case 5: 
				break ; 
		}
		
	}
	}
		//Add task function takes in name and description
		public static void add(Handler list) {
			String name, desc;

			System.out.print(" Task name: ");
			name = keyboard.nextLine();
			System.out.print("\nTask description: ");
			desc = keyboard.nextLine();

			list.addTask(new Item(name, desc));
		}
		
		//Removes task function. -1 so you don't have to enter in 0 
		public static void remove(Handler list) {
			int index;

			list.printAll(); 
			System.out.print("Number of Task to delete: ");
			index = keyboard.nextInt();
			keyboard.nextLine();

			list.deleteTask(index - 1);
		}
		
		//Complete task, sets status to true 
		public static void complete(Handler list) {
			System.out.println("Enter task to complete: ") ; 
			list.printAll();
			int complete = keyboard.nextInt() ; 
			list.Complete(complete - 1);
			list.dateFinish(complete - 1);
		}
		
	}
	

		
		
