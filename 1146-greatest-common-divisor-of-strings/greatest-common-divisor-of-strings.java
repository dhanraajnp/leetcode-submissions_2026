class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If they don't have the same repeating base pattern, no answer.
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int g = gcd(str1.length(), str2.length());
        return str1.substring(0, g);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
