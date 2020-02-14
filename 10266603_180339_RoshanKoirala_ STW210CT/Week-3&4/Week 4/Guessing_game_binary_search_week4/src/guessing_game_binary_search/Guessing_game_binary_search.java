/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessing_game_binary_search;
import java.util.Scanner;
/**
 *x 
 * @author HP
 */
public class Guessing_game_binary_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Think of any number between 1-20,000.");
        
        int max = 20000;
        int min = 1;
        int mid = (max + min)/2;
        
        Game_Guessing(mid);
    }
    
    public static void Game_Guessing(int mid_val)
    {
        Scanner prk = new Scanner(System.in);
        while(true)
        {
            System.out.println("Is your number " + mid_val +" ?(Y/N)");
            String truth = prk.nextLine();
            if(truth.equals("Y") || truth.equals("y"))
            {
                break;
            }
            
            System.out.println("Is your guess less than " + mid_val + "?(Y/N)");
            truth = prk.nextLine();

            if(truth.equals("Y") || truth.equals("y"))
            {
                if(mid_val == mid_val/2) 
                break;
                    mid_val = mid_val/2;
            }
            if(truth.equals("N") || truth.equals("n"))
            {
                if(mid_val == mid_val + mid_val/2) 
                break;
                    mid_val += mid_val/2;
            }
        }
        System.out.println("The guessed number was: "+mid_val);
    }
}
