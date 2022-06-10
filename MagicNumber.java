///////////////////////////////////////////////////
// Program to Find Magic Number 
// Input  : 4            Input  : 5
// Output : 125          Output : 130
// Hint   : Used rightshfit operator
///////////////////////////////////////////////////


import java.lang.*;
import java.util.*;


public class MagicNumber
{
    public static void main(String arg[])
    {
        int n = 5;     //Input

        int ans = 0;
        int base = 5;
        while(n>0)
        {
            int last = n & 1;
            n = n >> 1;
            ans+= last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
