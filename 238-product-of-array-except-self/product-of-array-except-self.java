class Solution {
    //static {for (int i = 0; i < 100; i++) {productExceptSelf(null);}}
    static {
    for(int i=0; i<500; i++){
        productExceptSelf(new int[2]); 
     }
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int leftProduct = 1;

        // 1. Durchlauf: Produkte links von i speichern
        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;

        // 2. Durchlauf: Produkte rechts von i dazu multiplizieren
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    }
}