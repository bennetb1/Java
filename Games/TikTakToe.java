import java.util.Scanner ; 

public class TikTakToe {
	Scanner input = new Scanner(System.in);
	  
	  public static void main(String[] args) {
	    char[][] board = new char[3][3];
	    int result = 1 ;
	    printboard(board);
	    
	    while(result != 0) {
	    	      
	    	      movement(board, 'X');
	    	      printboard(board) ; 
	    	      
	    	
	    	      for (int i = 0; i < 3; i++) {
	    	         if ( board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
	    	        System.out.println("X player won");
	    	        result = 0;
	    	      }
	    	      }
	    	         for (int b = 0; b < 3; b++) {
		    	         if ( board[0][b] == 'X' && board[0][b] == 'X' && board[0][b] == 'X') {
		    	        System.out.println("X player won");
		    	        result = 0;
		    	         }
	    	         }
		    	         if (board[0][0] == 'X'&& board[1][1] == 'X' && board[2][2] == 'X') {
		    	        	 System.out.println("X player won") ; 
		    	         }
		    	         if (board[0][2] == 'X'&& board[1][1] == 'X' && board[2][0] == 'X') {
		    	        	 System.out.println("X player won") ; 
		    	         }
		    	    for (int index0 = 0; index0 < 3; index0++) {
		    	         for (int index1 = 0; index1 < 3; index1++) {
	    	      }
		    	    }
	    	 
	    	      movement(board, 'O');
	    	      printboard(board);
	    	   
	    	      for (int index2 = 0; index2 < 3; index2++) {
	    	         if ( board[index2][0] == 'O' && board[index2][1] == 'O' && board[index2][2] == 'O') {
	    	        System.out.println("X player won");
	    	        result = 0;
	    	      }
	    	      }
	    	         for (int b2 = 0; b2 < 3; b2++) {
		    	         if ( board[0][b2] == 'O' && board[0][b2] == 'O' && board[0][b2] == 'O') {
		    	        System.out.println("O player won");
		    	        result = 0;
		    	         }
	    	         }
		    	         if (board[0][0] == 'O'&& board[1][1] == 'X' && board[2][2] == 'O') {
		    	        	 System.out.println("O player won") ; 
		    	         }
		    	         if (board[0][2] == 'O'&& board[1][1] == 'O' && board[2][0] == 'O') {
		    	        	 System.out.println("O player won") ; 
		    	         }
		    	    for (int index0 = 0; index0 < 3; index0++) {
		    	         for (int index1 = 0; index1 < 3; index1++) {
	    	      }
	    }
	    }
	  }
	    
	  
	  

		static void printboard(char[][] temp) {
			System.out.println("\n-------------");
			for (int i = 0; i < temp.length; i++) {
				for (int j = 0; j < temp[i].length; j++) {
					System.out.print("|" + temp[i][j]);
				}
				System.out.println("|\n-------------");
			}
		}
		
		static void movement(char[][]temp, char player) {
			Scanner input = new Scanner(System.in) ;
			int result = 0 ;
			while (result != 1) {
			char player1 = 'x' ;
			char player2 = '0' ;
			System.out.print("Enter a row for player " + player + ": ");
		      int row = input.nextInt();
		      System.out.print("Enter a column for player " + player + ": ");
		      int col = input.nextInt();
		      
		      if (temp[row][col] == '\u0000') { 
		          temp[row][col] = player;
		          result = 1;
		        }
		        else
		          System.out.println("Try again already placed there");
		      }
		    
		}
	}
	