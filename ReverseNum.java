import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        int rem=0;
        Scanner get=new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int num=get.nextInt();
        while(num>0)
        {
            rem=(rem*10)+(num%10);
            num=num/10;
        }
        System.out.println(rem);
    }
}
