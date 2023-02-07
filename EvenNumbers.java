public class EvenNumbers {
    public static void main(String[] args) {
        int i = 3;
        System.out.println("Even numbers from 3 till 30");
        for (i = 3; i<=30; i++)
        {
            if(i % 2 == 0) System.out.print(i+" ");
        }
    }
}
