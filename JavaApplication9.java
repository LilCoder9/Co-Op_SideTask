/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author howellx
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    
    //numbers into binary code
    public static void main(String[] args) {
         ArrayList<Integer> sa = new ArrayList<>();
         sa.add(6);
         sa.add(10);
         sa.add(11);
         sa.add(16);
         sa.add(256);
        int num = 256;
        String temps= "";
      for(int z =0; z < sa.size(); z++){
          temps = "";
        while(sa.get(z) > 0){
                
                 temps = sa.get(z)%2 +temps;
                int temp = (int)sa.get(z)/2;
                sa.set(z,temp);
              
        }
        System.out.println(temps);
    }
    }
    
}
