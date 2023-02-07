public class GreatestAmongThree
{
    public static void main(String[] args)
    {
        numbers check = new numbers();

        check.display(12,8,10);
        check.calculateTheGreatest(12, 8, 10);
    }
}
class numbers
{
    int a;
    int b;
    int c;

    void display(int a, int b, int c)
    {
        System.out.println("The first number is: "+a);
        System.out.println("The second number is: "+b);
        System.out.println("The third number is: "+c);
    }

    void calculateTheGreatest (int a, int b, int c)
    {
            if (a > b && a > c)
                System.out.println("The greatest among "+a+ ", "+b+ ", "+ " and "+c+ " is : "+a);
            else if (b > c && b > a)
                System.out.println("The greatest among "+a+ ", "+b+ ", "+ " and "+c+ " is : "+b);
            else if (a < b && a < c)
                System.out.println("The greatest among "+a+ ", "+b+ ", "+ " and "+c+ " is : "+c);
            else
                System.out.println("Each of them are equal.");
    }

}