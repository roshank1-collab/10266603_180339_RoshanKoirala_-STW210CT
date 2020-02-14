/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search_elem_binary_search;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Search_elem_binary_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner prk = new Scanner(System.in);
        
        System.out.println("Enter any 5 integer values: ");
        int ArrayNu[] = new int[5];
        for (int i = 0; i < 5; i++)
        {
            ArrayNu[i] = prk.nextInt();
        }
        
        int Nu_Search;
        System.out.println("Enter the value you want to search: ");
        Nu_Search = prk.nextInt();
        
        int n = ArrayNu.length;
        
        int result = Search_Binary(ArrayNu, 0, n - 1, Nu_Search);
        
        if (result == -1)
        {
            System.out.println("Element not present");
        }
        else
        {
            System.out.println("Element found at index " + result);
        }
    }
    public static int Search_Binary(int arr[], int l, int r, int search_value)
    { 
        if (r >= l) 
        { 
            int mid = l + (r - l) / 2; 
 
            if (arr[mid] == search_value)
            {
                return mid;
            }
            
            if (arr[mid] > search_value) 
            {
                return Search_Binary(arr, l, mid - 1, search_value);
            }
            return Search_Binary(arr, mid + 1, r, search_value);
        }
        else
        {
            return -1;
        }
    }
}
