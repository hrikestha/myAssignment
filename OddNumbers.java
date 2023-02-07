public class OddNumbers
{
    public static void main(String[] args)
    {
        int i = 2;
        System.out.println("Odd numbers from 2 till 20");
        for (i = 2; i<=20; i++)
        {
            if(i % 2 == 1) System.out.print(i +" ");
        }
    }
}

