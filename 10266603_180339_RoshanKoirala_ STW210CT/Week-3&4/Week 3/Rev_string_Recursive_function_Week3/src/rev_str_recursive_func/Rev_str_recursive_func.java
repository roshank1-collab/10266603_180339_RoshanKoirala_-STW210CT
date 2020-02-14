/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rev_str_recursive_func;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Rev_str_recursive_func {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner prk = new Scanner(System.in);
        
        System.out.println("enter string value to reverse: ");
        String name = prk.nextLine();
        
        String reversed = String_Reverse(name);
        System.out.println("reversed output of string is: "+reversed);
        
    }
    
    public static String String_Reverse(String myStr)
    {
	if(myStr.isEmpty())
        {
	System.out.println("Input is given !");	
	return myStr;
	}
	return String_Reverse(myStr.substring(1)) + myStr.charAt(0);
    }
 
}

