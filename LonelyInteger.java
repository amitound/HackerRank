import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int lonelyinteger(int[] a) {
    int flag=1;
	int i,k;
	int a_size = a.length;
	
	   for(i=0;i<a_size;i++)  
	   {  
	     flag=1;  
	     for(k=0;k<a_size;k++)  
	     {  
	       if(i != k && a[i] == a[k])  
	        {  
	            flag=0;        
	        }  
	     }  
	     if(flag == 1)  
	     {  
	        return a[i];     
	     }  
	   }
return 0;

    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}