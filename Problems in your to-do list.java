import java.util.*;
import java.lang.*;
import java.io.*;

class Problems in your to-do list
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner read = new Scanner(System.in);
	    int inputCases = read.nextInt();
	    
	    for(int i=0; i<inputCases; i++) {

	        int numOfProblems = read.nextInt();
	        int[] array = new int[numOfProblems];
	        int numToDelete = 0;
	        
	        for(int j=0; j<array.length; j++) {
	            array[j] = read.nextInt();
	            if(array[j] >= 1000) {
	                numToDelete++;
	            }
	        }
	        System.out.println(numToDelete);
	        
	    }

	}
}
