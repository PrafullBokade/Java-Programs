/* 
/////////////////////////////////////////////////////////////////////
//
// Function name : Print 1 to 100 without using Number
// Output        : 1 2 3 4 5 .......100        
// Description   : Here we can't use number to print numbers so
//                 Hint : we can use char  
// Author        : Prafull Bokade
//
//////////////////////////////////////////////////////////////////// 
// Input :  Not a Number
// Output : 1 2 3 4 5 .......100   
///////////////////////////////////////////////////////////////////
*/

import java.lang.*;
import java.util.*;



class Number 
{
    int one = 'a'/'a';
    int ten = "**********".length();
    
    // 2nd approch : we can use 'd' as ASCII for 'd' is 100 

    public int PrntNum()
    {
        int iCnt = one;


        for(iCnt = one; iCnt <= (ten*ten) ; iCnt++)
        {
           System.out.println(iCnt);
        }
        return 0;

    }

}

class Program_100
{
    public static void main(String b[])
    {
        Number nobj = new Number();
        int iRet  =0;

        nobj.PrntNum();
        
    }
}
