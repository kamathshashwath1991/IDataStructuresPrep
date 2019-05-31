package hashing;

import java.util.Map;

public class RemoveCommon {


    static String remove(String s1, String s2){

        int count[] = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i =0; i< s1.length();i++){
            count[s1.charAt(i)-'a']++;
        }

        for (int i = 0; i< s2.length();i++){
            count[s2.charAt(i) -'a']++;
        }

        for (int i =0; i< count.length;i++){
            if (count[i] == 1){
                sb.append((char) (i +'a'));
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String s1= "aacdb";
        String s2 = "gafd";

        System.out.println(remove(s1,s2));
    }
}
