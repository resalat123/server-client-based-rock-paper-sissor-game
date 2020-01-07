package server;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

	
public class Server1 {
	        
	public static void main(String[] args)

		{
	      	try
	      {
	         
	         ServerSocket serverSocket = new ServerSocket(800);
	         Socket s = serverSocket.accept();
	         	try
	         		{
	         			InputStream inStream = s.getInputStream();
	         			OutputStream outStream = s.getOutputStream();

	         			Scanner in = new Scanner(inStream);
	         			PrintWriter out = new PrintWriter(outStream, true);
	            
	         			String serverMove;
	         			String name;
	         			String ClientMove;
	         			String win;
	         			name = in.nextLine();
	            
	         			while(s.isConnected()){
	            	
	         				serverMove=getServerMove();
	         				out.println(serverMove);
	   
	         				ClientMove = in.nextLine();
	         				win=determineRoundWinner(ClientMove, serverMove);
	         				out.println(win);
	         			}
	         
	         		}
	         		finally {
	         			
	         		}
	         		
	         			
	      }
	      catch (IOException e){
	         e.printStackTrace();
	      }
	   }

	    static String getServerMove() {
		double compMoveInt;
		String compMove;

		
		compMoveInt = Math.random();

		
		if(compMoveInt >= 0.0 && compMoveInt <= 0.33) {
		    compMove = "rock";
		}
		else if (compMoveInt >= 0.3 && compMoveInt <= 0.6) {
		    compMove = "paper";
		}
		else {
		    compMove = "scissors";
		}

		return compMove;
	    } 
	        
	    
	    
	    static String determineRoundWinner(String ClientMove, String compMove) {
	    	
	    	String a= compMove;
	    	String b= ClientMove;
	  
	    	String result;
			if(a.equals(b)){
				 result="Draw";
				}
			else if (a.equals("rock") && b.equals("scissors")){
				result="System wins";
			}
			else if(a.equals("scissors") && b.equals("paper")){
				result=" System wins";
				}
			else if(a.equals("paper") && a.equals("rock")){
				result=" System wins";
			}
			else
				{ result="Congratulations! You have WON!";
				}
			return result;
			
	    }
	    
	      
	}
