package com.datastructures.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr)
    {
    	arr.size();
    	
    	for (int i=0;i<d;i++)
    	{
    	arr.add(arr.size(), arr.get(0));
    	arr.remove(0);
    	}
		return arr;
 
    }
    			
}

public class LeftRotation {
    public static void main(String[] args) {
    

        int n ;

        int d = 3 ;


        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <=5; i++) {
        
            arr.add(i);
        }

        List<Integer> result = Result.rotateLeft(d, arr);
        System.out.print(result);
        System.out.print(arr.size());
        
       
      
    }
}
