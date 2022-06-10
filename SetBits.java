///////////////////////////////////////////////////
// Program to Find Set Bits in given Number
// Input  :  3456           Input  : 123
// Output :  110110000000   Output : 1111011
//           4                     6
///////////////////////////////////////////////////


import java.lang.*;
import java.util.*;



public class SetBits
{
    public static void main(String arg[])
    {
        int n = 123;     //Input
        
        System.out.println(Integer.toBinaryString(n));
        System.out.println(SetBits(n));

    }
    private static int SetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count++;
            n = n & (n -1);
        }

        return count;
    }
}
