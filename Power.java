///////////////////////////////////////////////////
// Program to Find Power of given Number
// Input  :  3 ^ 6          Input  : 4 ^ 5
// Output :  729            Output : 1024
///////////////////////////////////////////////////


import java.lang.*;
import java.util.*;


public class Power
{
    public static void main(String arg[])
    {
        int base = 3;     //Input
        int power = 6;

        int ans = 1;
        
        while (power > 0)
        {
            if((power & 1)== 1)
            {
                ans = ans*base;
            }
            base *=base;
            power = power >>1;
        }
        System.out.println(ans);
    }
}
