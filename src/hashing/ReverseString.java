package hashing;

public class ReverseString {

    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        //String s1[] = (s.replace('.', ' ')).split(" ");
        String s1[] = s.split("\\.");

        String ans = " ";
        for (int i = s1.length-1;i>=0;i--){
            ans += s1[i] + " ";
        }


       // System.out.println(ans.replace(' ','.').substring(1,ans.length()-1));

    }

}
