/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2d_arraylist;
import java.util.*;
/**
 *
 * @author howellx
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // To make an double arraylist(its just arrays in a big array)
        
      
        //making a bunch of arrays with values inside
        ArrayList<String> bakery = new ArrayList();
        bakery.add("bread");
        bakery.add("twist");
        bakery.add("muffins");
        
        ArrayList<String> maet = new ArrayList();
        maet.add("steak");;
        maet.add("ribs");
        
        ArrayList<String> fruit = new ArrayList();
        fruit.add("strawberyy");
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("tomato");
        fruit.add("bannaan");
        
        //syntax for creating an double array... IN ADDITION all the arrays must be same type but doesnt need to same size
        ArrayList<ArrayList<String>> groceyList = new ArrayList();
        groceyList.add(fruit);
        groceyList.add(maet);
        groceyList.add(bakery);
        
        //...how to access an array inside 2D arraylist
        groceyList.get(0);
        //...how to access an value inside an array from an 2D arraylist
        groceyList.get(0).get(0);
        
        
        
        
        
      
      // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
        
    }
    
}


