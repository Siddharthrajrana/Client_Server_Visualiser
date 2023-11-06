import java.io.*;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Client{

    public static void main(String[] args){

        try{
            System.out.println("Client Started ");
            JOptionPane.showMessageDialog(null, "Client Started");
            Socket soc =new Socket("localhost",9806);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            
        
						//STARTING SWITCH CASE
			while(true)
			{
				
				System.out.println("\t\t\t\t~~SELECT YOUR CHOICE~~\n\n");
				System.out.println("1.  ADDITION");
				System.out.println("2.  SUBTRACTION");
				System.out.println("3.  MULTIPLICATION");
				System.out.println("4.  DIVISION");
				System.out.println("5.  MODULO");
				System.out.println("6.  FACTORIAL");
				System.out.println("7.  EXPONENTIAL");
                System.out.println("8.  CHECK PRIME");
                System.out.println("9.  CHECK ARMSTROMG");
                System.out.println("10. CHECK ODD OR EVEN");
                System.out.println("11. NTH ROOT OF A NUMBER");
                System.out.println("12. PRINT PATTERN OF PYRAMID");
                System.out.println("13. EXIT FROM THE PROGRAM");
				System.out.print("\nENTER YOUR CHOICE FROM THE ABOVE LIST (1 to 13) : ");
				int choice = -1;
				
				
				try {
					choice = Integer.parseInt(inp.readLine());
				} catch(Exception e) {
					// default will handle
				}
				System.out.print("\n****************######################****************\n");
				if(choice == 13)
				{
					System.exit(0);
				}
				
				
				switch(choice)
				{
				case 1:
                    System.out.print("Enter the First number : ");
                    int number1 = Integer.parseInt(userInput.readLine());
                    System.out.print("Enter the Second number : ");
                    int number2 = Integer.parseInt(userInput.readLine());
                    PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
                    out.println(number1);
                    out.println(number2);
                    BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                    System.out.println(in.readLine());
					
					break;
			
				case 2:
                    System.out.print("Enter the First number : ");
                    int n1 = Integer.parseInt(userInput.readLine());
                    System.out.print("Enter the Second number : ");
                    int n2 = Integer.parseInt(userInput.readLine());
                    PrintWriter out1 = new PrintWriter(soc.getOutputStream(),true);
                    out1.println(n1);
                    out1.println(n2);
                    BufferedReader ins = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                    ins.readLine();
                    System.out.println(ins.readLine());
					
					break;
				
				case 3:
                    System.out.print("Enter the First number : ");
                    int num1 = Integer.parseInt(userInput.readLine());
                    System.out.print("Enter the Second number : ");
                    int num2 = Integer.parseInt(userInput.readLine());
                    PrintWriter out2 = new PrintWriter(soc.getOutputStream(),true);
                    out2.println(num1);
                    out2.println(num2);
                    BufferedReader ins1 = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                    ins1.readLine();
                    ins1.readLine();
                    System.out.println(ins1.readLine());
					break;
				
				case 4:
                    System.out.print("Enter the First number : ");
                    int num1d = Integer.parseInt(userInput.readLine());
                    System.out.print("Enter the Second number : ");
                    int num2d = Integer.parseInt(userInput.readLine());
                    PrintWriter out2d = new PrintWriter(soc.getOutputStream(),true);
                    out2d.println(num1d);
                    out2d.println(num2d);
                    BufferedReader ins1d = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                    ins1d.readLine();
                    ins1d.readLine();
                    ins1d.readLine();
                    System.out.println(ins1d.readLine());			
					break;
				
				case 5:
					System.out.print("Enter the First number : ");
                    int num1m = Integer.parseInt(userInput.readLine());
                    System.out.print("Enter the Second number : ");
                    int num2m = Integer.parseInt(userInput.readLine());
                    PrintWriter out2m = new PrintWriter(soc.getOutputStream(),true);
                    out2m.println(num1m);
                    out2m.println(num2m);
                    BufferedReader ins1m = new BufferedReader(new InputStreamReader(soc.getInputStream()));
                    ins1m.readLine();
                    ins1m.readLine();
                    ins1m.readLine();
                    ins1m.readLine();
                    System.out.println(ins1m.readLine());
					break;
				
                case 6:
                    System.out.print("Enter the First number : ");
                    System.out.print("Enter the Second number : ");
                    break;

                case 7:
                    System.out.print("Enter the First number : ");
                    System.out.print("Enter the Second number : ");
                    break;

                case 8:
                    System.out.print("Enter the First number : ");
                    System.out.print("Enter the Second number : ");
                    break;

				case 9:
                    System.out.print("Enter the First number : ");
                    System.out.print("Enter the Second number : ");
					break;
                case 10:
                    System.out.print("Enter the First number : ");
                    System.out.print("Enter the Second number : ");
                    break;
                case 11:
                    System.out.print("Enter the First number : ");
                    System.out.print("Enter the Second number : ");
                    break;
                case 12:
                    System.out.print("Enter the First number : ");
                    System.out.print("Enter the Second number : ");
					break;
               	             default:  
                    	        System.out.println("Please enter a valid option! ");
                        	    System.out.println("The options you can choose are from 1 to 12. ");
                            
				}
			}
			
		
	


            
            // System.out.println("Enter First number : ");
            // int number = Integer.parseInt(userInput.readLine());
            // System.out.println("Enter Second  number : ");
            // int number2 = Integer.parseInt(userInput.readLine());
            // PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            // out.println(number);
            // out.println(number2);
            // BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            // System.out.println(in.readLine());
            // System.out.println(in.readLine());
            // System.out.println(in.readLine());
            // System.out.println(in.readLine());
            // System.out.println(in.readLine());

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
