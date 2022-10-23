import java.util.Scanner;

public class upperToLower {
    public static void main(String args[])
    {
        String st;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string which is to be converted to lowercase");
        st=sc.nextLine();
        String ans = "";
        for(i=0;i<st.length();i++)
        {
            if(st.charAt(i)>='A' && st.charAt(i)<='Z')
            {
                ans+=(char)((int)st.charAt(i)+32);
            }
        }
        System.out.println("The string in LowerCase is");
        System.out.println(ans);
    }
}
