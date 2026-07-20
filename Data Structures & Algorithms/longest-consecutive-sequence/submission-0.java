class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet();
int global=0;
int current=0;
    for(int num:nums){

        s.add(num);

    }

    for(int num:nums){

    if(s.contains(num-1))
    continue;

    while(s.contains(num)){
        current++;
        num=num+1;



    }
    
    global=Math.max(current,global);
    current=0;





    }
    return global;

    }
}
