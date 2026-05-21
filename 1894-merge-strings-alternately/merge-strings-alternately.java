class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();

        // Merge characters alternately
        while (i < len1 && j < len2) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }

        // Append remaining characters from word1 or word2
        if (i < len1) {
            merged.append(word1.substring(i));
        }
        if (j < len2) {
            merged.append(word2.substring(j));
        }

        return merged.toString();
    }
}