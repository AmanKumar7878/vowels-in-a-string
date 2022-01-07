import java.util.Scanner;

public class vowelinstring {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String st =sc.next();
        for (int i= 0;i<st.length();i++)
        {
            char ch = st.charAt(i);
            if(ch == 'a' ||ch == 'A'|| ch =='e'|| ch =='E'|| ch =='i'||ch =='I'||ch =='o'||ch =='O'||ch =='u'||ch =='U')
            {
                count++;
            }


        }
        System.out.println(count);
    }
}
