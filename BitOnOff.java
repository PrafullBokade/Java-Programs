///////////////////////////////////////////////////////////
// check wheather 14th bit of given number is ON or OFF
// Using Hexa decimal number
// Hint : 
// 0000 0000 0000 0000 0010 0000 0000 0000 
//   0    0    0    0   2     0    0    0
///////////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;


class Bitwise
{
    public boolean CheckBit(int iNo)
    {
        
        int iMask = 0X00002000;     
        int iResult = 0;

        iResult = iNo & iMask ;


        if (iResult != 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}


class BitOnOff

{
    public static void main(String[] args) 
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number : ");
        int value = sobj.nextInt();
        
        Bitwise bobj = new Bitwise();
        boolean bret = bobj.CheckBit(value);

        if (bret == true)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }

    }
}