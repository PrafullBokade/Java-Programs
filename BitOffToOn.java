/////////////////////////////////////////////////////
// check wheather 27th bit is OFF then ON it 
// if it ON then return as it is
// Hint : 
// 0000 0100 0000 0000 0000 0000 0000 0000 
//   0    4    0    0    0    0    0   0 
/////////////////////////////////////////////////////

import java.lang.*;
import java.util.*;


class Bitwise
{
    public int OnBit(int iNo)     // 27bit
    {
        
        int iMask = 0X04000000;      //67108864
        int iResult = 0;

        iResult = iNo | iMask ;

        return iResult;

    }
}


class BitOffToOn

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