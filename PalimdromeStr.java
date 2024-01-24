import java.util.Scanner;
public class PalimdromeStr
{
        public static void main(String[] args)
        {
            Scanner get= new Scanner(System.in);
            System.out.println("Enter a string to reverse: ");
            String str=get.nextLine();
            String str2="";
            for(int i=str.length()-1;i>=0;i--)
            {
                str2=str2+str.charAt(i);
            }
            if(str2.equals(str))
            {
                System.out.println("Palimdrome");
            }
            else
            {
                System.out.println("Not a Palimdrome");
            }
        }


}
