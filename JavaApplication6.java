/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author howellx
 */import java.util.*;
import java.io.*;
import java.math.*;

//this jsut displays P I S U O in astreiks with proper spacing
public class JavaApplication6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "PISSUOSUO";
        for(int i =0; i < 4; i++){
            for(int j = 0; j < text.length(); j++){
        switch(i){
            case 0:
                if(text.charAt(j)== 'P' || text.charAt(j)== 'p')
                 System.out.print("***");
                else if(text.charAt(j)== 'I' || text.charAt(j)== 'i')
                    System.out.print("*"); 
                else if(text.charAt(j)== 'S' || text.charAt(j)== 's')
                     System.out.print("***");
                else if(text.charAt(j)== 'O' || text.charAt(j)== 'o')
                    System.out.print("***"); 
                else if(text.charAt(j)== 'U' || text.charAt(j)== 'u')
                     System.out.print("* *");  
                else System.out.print("***");    
                break;
            case 1:
                if(text.charAt(j)== 'P' || text.charAt(j)== 'p')
                 System.out.print("***");
                else if(text.charAt(j)== 'I' || text.charAt(j)== 'i')
                    System.out.print("*"); 
                else if(text.charAt(j)== 'S' || text.charAt(j)== 's')
                     System.out.print("*  ");
                else if(text.charAt(j)== 'O' || text.charAt(j)== 'o')
                    System.out.print("* *"); 
                else if(text.charAt(j)== 'U' || text.charAt(j)== 'u')
                     System.out.print("* *");  
                else System.out.print("* *");    
                break;
            case 2:
                if(text.charAt(j)== 'P' || text.charAt(j)== 'p')
                 System.out.print("*  ");
                else if(text.charAt(j)== 'I' || text.charAt(j)== 'i')
                    System.out.print("*"); 
                else if(text.charAt(j)== 'S' || text.charAt(j)== 's')
                     System.out.print("***");
                else if(text.charAt(j)== 'O' || text.charAt(j)== 'o')
                    System.out.print("* *"); 
                else if(text.charAt(j)== 'U' || text.charAt(j)== 'u')
                     System.out.print("* *");  
                else System.out.print("* *");    
                break;
                case 3:
                if(text.charAt(j)== 'P' || text.charAt(j)== 'p')
                 System.out.print("*  ");
                else if(text.charAt(j)== 'I' || text.charAt(j)== 'i')
                    System.out.print("*"); 
                else if(text.charAt(j)== 'S' || text.charAt(j)== 's')
                     System.out.print("***");
                else if(text.charAt(j)== 'O' || text.charAt(j)== 'o')
                    System.out.print("***"); 
                else if(text.charAt(j)== 'U' || text.charAt(j)== 'u')
                     System.out.print("***");  
                else System.out.print("* *");    
                break;
        }
        if(j != text.length()-1){
            System.out.print(" ");
            }
            
        }
            System.out.println("");

        
    }
}
    

}    
    

