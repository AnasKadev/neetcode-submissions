class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer,Integer> hash = new HashMap();

        for(int num:nums){
            
            hash.put(num, 1+hash.getOrDefault(num, 0));


            if(hash.get(num)>1)
            return true;



        }
        return false;

    }
}