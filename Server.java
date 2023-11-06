import java.net.ServerSocket;
import java.io.*;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Server {

    public static void main(String[] args ){

        try{
            System.out.println("Waiting For Client...");
            JOptionPane.showMessageDialog(null, "Waiting For Client...");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            
            System.out.println("Connection Estsblished ");
            JOptionPane.showMessageDialog(null, "Connection Established");
            
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number1 = Integer.parseInt(in.readLine());
            int number2 = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            
            out.println("Sum of "+number1 + " and "+number2+" is "+add(number1,number2));
            out.println("Difference of "+number1 + " and "+number2+" is "+sub(number1,number2));
            out.println("Multiplication of "+number1 + " and "+number2+" is "+multiply(number1,number2));
            out.println("Division of "+number1 + " and "+number2+" is "+divison(number1,number2));
            out.println("Modulo of "+number1 + " and "+number2+" is "+mod(number1,number2));
            out.println("Factorial of "+number1+" is :  "+calculateFactorial(number1));

        }
        catch(Exception  e){
            e.printStackTrace();
        }
    }

    static int mod(int n1 , int n2){ 
        return n1%n2;
    }

    static int sub(int number ,int number2){
        return number-number2;
    }

    static int add(int number1,int number2){
        return number1+number2;
    }

    static int multiply(int number,int number2){
        return number*number2;
    }

    static int divison(int number,int number2){
        return number/number2;
    }

    
    static int calculateFactorial(int number){

        int fact = 1;
        for(int i=1 ; i<=number ; i++ ){
            fact = fact*i;
        }
        return fact;

    }

}
