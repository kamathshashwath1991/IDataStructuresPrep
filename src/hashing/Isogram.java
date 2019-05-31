package hashing;

import java.util.HashSet;

public class Isogram {

    static boolean checkIfIsogram(String s){
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i< s.length(); i++){
            if (hs.contains(s.charAt(i))){
                return false;
            }

            hs.add(s.charAt(i));
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "rad";

        System.out.println(checkIfIsogram(s));
    }
}
