/* Salary Scale:
Low Scale: 0 - 40k
Mid Scale: 40k - 100k
High Scale: 100k+
 */

public class SalaryScale {
    public static void main(String[] args) {
    Salary obj1 = new Salary();
    obj1.check(98,40,100);
    }
}

class Salary
{
    int s;
    int l;
    int m;

    void display(int s)
    {
        System.out.println("Hi. Your salary is: "+s+"k");
    }

    void check(int s, int l, int m)
    {
        display(s);
        if (s <= 0)
            System.out.println("Invalid salary.");
        else if (s>0 && s<=l)
            System.out.println("Your salary is in low-scale range.");
        else if (s>l && s<=m)
            System.out.println("Your salary is in mid-scale range.");
        else
            System.out.println("Your salary is in high-scale range.");
    }
}