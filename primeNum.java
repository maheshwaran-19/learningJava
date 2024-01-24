import java.util.Scanner;
public class primeNum {
    public static void main(String[] args) {
        int prime=1; int i=2;
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n=get.nextInt();
        while(i<n)
        {
            if (n % i == 0)
            {
                System.out.println("Not a prime number");
                prime = 0;
                break;

            }

            i++;
        }
        if (prime == 1)
        {
            System.out.println("Prime number");
        }
    }
}
