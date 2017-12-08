
public class XsAndYs
{
    public static void main( String[] args )
    {
         System.out.println("x        y");;
         System.out.println("--------------");

        for ( double n = -10; n <= 10 ; n += 0.5 )
        {
           System.out.println(n+"        "+Math.pow(n,2));
        }

    }
}
//  x      y
// -----------------
// -10.0   100.00
// -9.5    90.25
// -9.0    81.00
// -8.5   
// -8.0    64.00
// ...
// 9.0     81.00
// 9.5     90.25
// 10.0    100.00