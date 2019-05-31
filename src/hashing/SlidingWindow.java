package hashing;

public class SlidingWindow {

    static void findSubString(String str, String pat){
        int len1 = str.length();
        int len2 = pat.length();


        int hash_str[] = new int[len1];
        int hash_pat[] = new int[len2];

        int start = 0; int start_index = 0;

        if (len1 < len2){
            return;
        }


        int count = 0;

        for (int i = 0; i< pat.length();i++){
            hash_pat[pat.charAt(i)]++;
        }

        for (int i = 0; i< len1; i++){
            hash_str[str.charAt(i)]++;

            if (hash_str[str.charAt(i)] <= hash_pat[pat.charAt(i)]){
                count++;
            }


            if (count == len2){

                while (hash_str[str.charAt(start)] > hash_pat[str.charAt(start)]){

                }
            }



        }
    }

    public static void main(String[] args) {
        String str = "this is a test string";
        String pat = "tist";

        findSubString(str,pat);
    }
}
