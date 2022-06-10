///////////////////////////////////////////////////
// Program to Find Unique Number in given array
// Input  : arr{ 2, 3, 4, 3, 2, 6, 4}
// Output : Ans :  6
// Hint   : Used Bitwise operator ^ 
///////////////////////////////////////////////////



import java.lang.*;
import java.util.*;


public class FindUnique
{
    public static void main(String arg[])
    {
        int arr[] = {2,3,4,3,2,6,4};
        System.out.println(ans (arr));
    }
    private static int ans(int arr[])
    {
        int unique = 0;

        for (int n : arr)
        {
            unique ^=n;
        }
        return unique;

    }
}