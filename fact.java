import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        System.out.print("Enter the number for its factorial to find: ");
        Scanner get= new Scanner(System.in);
        int n = get.nextInt();
        int i=1,f=1;
        while(i<=n){
            f*=i; i++;
        }
        System.out.println("The factorial of "+n+" is: "+ f );
    }
}
