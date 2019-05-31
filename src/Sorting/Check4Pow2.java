package Sorting;

public class Check4Pow2 {

    public boolean check(int x){

        if (x ==0  && (x & (x-1)) == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int x = 4;

        Check4Pow2 c = new Check4Pow2();
        System.out.print(c.check(4));

    }
}
