class Solution {
    public int maxIceCream(int[] costs, int coins) {
        var maxCost = Integer.MIN_VALUE;
        for (var c : costs) maxCost = Math.max(maxCost, c);

        var freq = new int[maxCost + 1];
        for (var c : costs) freq[c]++;

        var count = 0;
        for (var f = 1; f <= maxCost; f++) {
            if (freq[f] == 0) continue;
            var buyCount = Math.min(freq[f], (coins/f));
            count += buyCount;
            coins -= (buyCount * f);
            if (coins < f) break;
        }
        return count;
    }
}