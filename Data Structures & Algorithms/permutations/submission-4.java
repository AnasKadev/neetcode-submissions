class Solution {

       

    void backtrack(int index,int [] nums,List<Integer> current,List<List<Integer>> result,boolean [] used){


        if(current.size()==nums.length){
        result.add(new ArrayList(current));
            return;

        }


        for(int i=0;i<nums.length;i++){

            if(used[i]==true)
            continue;
         
            current.add(nums[i]);
            used[i]=true;

         backtrack(i,nums,current,result,used);

         current.remove(current.size()-1);
        
        used[i]=false;



        }




    }


    public List<List<Integer>> permute(int[] nums) {

     List<Integer> path = new ArrayList<>();
 List<List<Integer>> result = new ArrayList<>();

 boolean [] used = new boolean [nums.length];

        
        backtrack(0,nums,path,result,used);

        return result;

    }
}
