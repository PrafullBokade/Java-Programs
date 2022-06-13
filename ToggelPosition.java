/////////////////////////////////////////////////////////////
// Accept input from User for Number and Position  
// Program to Toggel Position of bit if OFF then ON it 
// if it ON then OFF it
/////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;

class Bitwise
{
    public int ToggleBit(int iNo, int iPos)    
    {
        if((iPos<=0)||(iPos>32))
        {
            System.out.println("Invalid Position");
            return 0;
        }

        int iMask = 0X00000001;     
        int iResult = 0;

        iMask = iMask << (iPos - 1);
         
        iResult = iNo ^ iMask ;

        return iResult;

    }
}


class ToggelPosition

{
    public static void main(String[] args) 
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number : ");
        int value = sobj.nextInt();


        System.out.println("Enter position : ");
        int pos = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        int iRet = bobj.ToggleBit(value, pos);

        System.out.println("Updated Number is : "+iRet);

    }
}