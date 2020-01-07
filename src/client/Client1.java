package client;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client1 {

	   public static void main(String[] args) throws IOException
	   {
	       
	      try
	      {
	         
	         Socket s = new Socket("localhost", 800);

	         try
	         {
	            InputStream inStream = s.getInputStream();
	            Scanner in = new Scanner(inStream);
	            PrintWriter out = new PrintWriter(s.getOutputStream(),true);

	                System.out.println( "Please enter your name:\n");
	                Scanner sc = new Scanner(System.in);
	                String playerName = sc.nextLine();
	                String PN=playerName.toUpperCase();

	                out.println(PN);
	             
	                	System.out.println(PN + ", welcome to the game of Rock, Paper, Scissors....\n");
	                
					Scanner user = new Scanner(System.in);
					String winnerResult;
					String UserChoice;
					String ServerMove;
					while(true){
						 System.out.println("Choose Any Option From These Three : (rock, Paper, scissors!)");
					
						 UserChoice = user.nextLine();
				
					out.println(UserChoice);

					ServerMove = in.nextLine();
					
					System.out.println ("Your move = " + UserChoice + "\nServer move = "+ServerMove);

					winnerResult = in.nextLine();
					if(winnerResult.equals("Draw"))
					{
					    System.out.println("Its a Draw try again");
					}
					else
					System.out.println(winnerResult);
					
					}
	             

	              }
	              finally
	              {
	                  
	              }
	           }
	           catch (IOException e)
	           {
	              e.printStackTrace();
	           }
	      }
	}