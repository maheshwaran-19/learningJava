import java.util.Scanner;
public class RevStr {
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str=get.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
