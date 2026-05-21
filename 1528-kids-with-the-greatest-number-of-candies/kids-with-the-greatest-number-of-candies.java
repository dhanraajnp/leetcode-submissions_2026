class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> list = new ArrayList<>();

        for(int i : candies){
            if(max < i)
                max = i;
        }
        //System.out.println("max:"+max);

        for(int i : candies){
            if(i + extraCandies >= max)
                list.add(true);
            else 
                list.add(false);
        }

        return list;
    }
}