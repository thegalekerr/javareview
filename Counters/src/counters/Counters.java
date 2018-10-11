/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counters;


public class Counters {


    public static void main(String[] args) {
        
    }
            
        int count (String str) { 
            int count = 0;
                for (int i = 0; i < str.length()-1; i++) { 
                       if (str.substring(i, i+2).equals("xx")) count++;
                }
               
                return count;
    }
    
        boolean doubleX(String str) { 
              int i = str.indexOf("x"); 
              if (i == -1) {
                  return false;
              }
              if (i+1 >= str.length()) { 
                  return false; 
              }
              return str.substring(i+1,i+2).equals("x");
        }
        
        
    
    
  
}
