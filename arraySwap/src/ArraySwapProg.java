import java.util.Scanner;

public class ArraySwapProg
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        arrayswap swap = new arrayswap();
        for (int i=0; i<10; i++)
        {
            System.out.println("Enter number " + (i+1) );
            int x = in.nextInt();
            swap.addinarray (x);

        }
        swap.largecheck();
        swap.smallcheck();
        swap.swapping();
    }
}
