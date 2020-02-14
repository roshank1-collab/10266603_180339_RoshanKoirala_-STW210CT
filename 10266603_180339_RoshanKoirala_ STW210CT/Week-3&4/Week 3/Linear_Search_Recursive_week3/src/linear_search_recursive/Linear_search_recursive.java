/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear_search_recursive;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Linear_search_recursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner prk = new Scanner(System.in);
        
        System.out.println("Enter five integer ");
        int ArrayNo[] = new int[5];
        for (int i = 0; i < 5; i++)
        {
            ArrayNo[i] = prk.nextInt();
        }
        
        int val_search;
        System.out.println("input the required value to search: ");
        val_search = prk.nextInt();
        
        int index = SearchNu(ArrayNo, 0, ArrayNo.length-1, val_search);
        
        if (index != -1)
        {
           System.out.println("Element " + val_search + " is present at index " +index); 
        }
        else
        {
            System.out.println("Element " + val_search + " is not present");
        }
    }
    
    public static int SearchNu(int arr[], int l, int r, int value_search) 
    { 
          if (r < l)
          {
             return -1;
          }
          if (arr[l] == value_search)
          {
             return l;
          }
          if (arr[r] == value_search)
          {
             return r;
          }
          return SearchNu(arr, l+1, r-1, value_search);
    }
}


