package hashmap;


//import java.util.*;
//import java.io.*;
//import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **//*
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String c = Integer.toString(N);
        HashMap<Character,Integer> num = new HashMap<>();
        for(int i =0; 0 < c.length(); i++){
            if(num.containsKey(c.charAt(i)) == false){
                num.put(c.charAt(i),1);
            }
            else{
                int s = num.get(c.charAt(i));
                num.replace(c.charAt(i),s);
            }
        }
        for(int i = 0; i < )


    }
}*/
/*
	Goal
Given an integer N, return the length of the longest sequence containing the same digit.
Input
An integer N.
Output
A single line containing the integer K which is the length of the longest sequence of repeated digits.
Constraints
2 ≤ N ≤ 100000000
Example
Input
111
Output
3
*/




/*
Input
Row 1: The string s.
Row 2: The form f.
Output
The formatted string.
Constraints
s contains only letters.
Length of f < 250
The number of x's and X's always equals the length of s.
Example
Input
sAmMyJr
Xxxxx, Xx.
Output
Sammy, Jr.
*/
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class HashMap {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = "sAmMyRR";
        String f = "XxXxx,-      Xx.";
        String n = ""; 
        int delay=0;
          for(int i = 0; i < f.length(); i++){
            if(f.charAt(i)== 'X'){
                n=n+ Character.toUpperCase(s.charAt(delay));
                delay++;
            }
            else if(f.charAt(i)=='x'){
                n=n+ Character.toLowerCase(s.charAt(delay));
                delay++;
            }
            else{
                n = n +f.charAt(i);
            }
        }
        System.out.print(n);
    }
}