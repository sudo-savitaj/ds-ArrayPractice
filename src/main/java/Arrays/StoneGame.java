//https://leetcode.com/problems/stone-game/solution/
package Arrays;

public class StoneGame {


    public boolean stoneGame(int[] piles) {
        int startIdx = 0, endIdx = piles.length - 1;
        int alexCollection = 0, leeCollection = 0;
        boolean alexTurn = true;
        while (startIdx <= endIdx) {
            int selectedValue = piles[startIdx] > piles[endIdx] ? piles[startIdx++] : piles[endIdx--];
            if (alexTurn)
                alexCollection += selectedValue;
            else
                leeCollection += selectedValue;
        }
        return alexCollection > leeCollection;
    }

    public void display() {
        int[] piles = {5, 3, 4, 5};
        boolean didAlexWin = stoneGame(piles);
        System.out.println(didAlexWin);
    }
}
