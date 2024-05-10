/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package searchdataclient;
import java.util.*;
/**
 *
 * @author Admin
 */
public class SearchDataClient {

  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter The Data to Search");
       // String data = sc.nextLine();
        
        mypac.SearchData client = new mypac.SearchData();
        String ans = client.searchDataMethod("find");
        System.out.println("Result :" + ans);
        
        
    }
    
}