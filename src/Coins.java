import java.util.*;

public class Coins {

    private class CoinsDetails{
        int coin;
        int noOfCoin;
        CoinsDetails(int coin, int noOfCoin) {
            this.coin = coin;
            this.noOfCoin = noOfCoin;
        }

    }

    List<CoinsDetails> getCoins(List<Integer> coinList,int target) {
        Set<Integer> set = new HashSet<Integer>();
        for(Integer coin:coinList) {
            set.add(coin);
        }

        for (int i=coinList.size()-1;i>0;i--) {
            List<CoinsDetails> res = new ArrayList<CoinsDetails>();
            if (isCoinSumEqual(coinList,set,i,target, res)) {
                return res;
            }
        }

        return null;
    }

    private boolean isCoinSumEqual(List<Integer> coinList,Set<Integer> set,int index, int target, List<CoinsDetails> res) {
        int rem = 0;

        for (int i=index;i>0;i--) {
            if (rem != 0) target = rem;
            if(coinList.get(i) <= target) {
                rem = target%coinList.get(i);
                res.add(new CoinsDetails(coinList.get(i),target/coinList.get(i)));
                if(set.contains(rem)) {
                    res.add(new CoinsDetails(rem,1));
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer coins[] = {1,5,10,25};

        Coins c = new Coins();
        List<Coins.CoinsDetails> result = c.getCoins(Arrays.asList(coins),76);

        for (CoinsDetails cd: result){
            System.out.println(cd.coin + "->" + cd.noOfCoin);
        }
    }
}
