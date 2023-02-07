

public class Interest {
    public static void main(String[] args) {
    Data obj1 = new Data();

    obj1.setData(5000,3,13,4);

    float SimpInt = obj1.SimpleInterest();
    System.out.println("Simple Interest is : "+SimpInt);

    float CompInt = obj1.CompoundInterest();
        System.out.println("Compound Interest is : "+CompInt);
    }
}

class Data
{
    float principal;
    float time;
    float rate;
    float si;
    float ci;
    int n;

    void setData(float p, float t, float r, int n)
    {
        principal = p;
        time = t;
        rate = r;
        System.out.println("Principal : "+p);
        System.out.println("Time period (in years) : "+t);
        System.out.println("Rate of interest per annum :"+r);
    }

    float SimpleInterest()
    {
        System.out.println("Calculating your Simple Interest...");
        float si = (principal * time * rate)/100;
        return si;
    }
    float CompoundInterest()
    {
        System.out.println("Calculating your Compound Interest...");
        //float ci = principal * (( 1 + rate/100 ) ** (n * time));
        return ci;
    }
}
