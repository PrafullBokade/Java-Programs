//////////////////////////////////////////////////////////////////
// check wheather toggel 4th and 7th bit is OFF then ON it 
// if it ON then OFF it
// Using Hexa decimal number
// Hint : 
// 0000 0000 0000 0000 0000 0000 0100 1000 
//   0    0    0    0    0    0    4   8  
//////////////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;


class Bitwise
{
    public int OnBit(int iNo)    
    {
        
        int iMask = 0X00000048;     
        int iResult = 0;

        iResult = iNo ^ iMask ;

        return iResult;

    }
}


class ToggelTwoPos

{
    public static void main(String[] args) 
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number : ");
        int value = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        int iret = bobj.OnBit(value);
        
        System.out.println("Updated number is: "+iret);
    

    }
}