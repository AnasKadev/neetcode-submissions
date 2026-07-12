class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> res = new ArrayList<>();
     List<Integer> path = new ArrayList<>();
    backtrack(candidates,path,res,target,0);
    return res;
    }
    private void backtrack(int[] candidates,List<Integer> path,List<List<Integer>> res,int target,int start){
        if(sum(path)>target){
     return;
     }
     if (sum(path)==target ){
res.add(new ArrayList<>(path));
     return;
     }
     
     for(int i = start; i < candidates.length; i++){

    path.add(candidates[i]);

    backtrack(candidates,path, res,target,i);

    path.remove(path.size() - 1);

    }
    }


 private int sum(List<Integer> l){
        int sum =0;
        for(int num:l){
        sum=sum+num;
        }
        return sum;

    }
}