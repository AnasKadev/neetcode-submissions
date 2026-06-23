class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> sh = new HashMap<>();
        HashMap<Character,Integer> th = new HashMap<>();

        int[] res = {0,0};
        int have = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;

        for(int i=0;i<t.length();i++){
            th.put(t.charAt(i), th.getOrDefault(t.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(th.containsKey(c)){
                sh.put(c, sh.getOrDefault(c,0)+1);

                if(sh.get(c).intValue() == th.get(c).intValue()){
                    have++;
                }
            }

            while(have == th.size()){

                if(i - left + 1 < minLen){
                    minLen = i - left + 1;
                    res[0] = left;
                    res[1] = i;
                }

                char lc = s.charAt(left);

                if(th.containsKey(lc)){
                    sh.put(lc, sh.get(lc) - 1);

                    if(sh.get(lc) < th.get(lc)){
                        have--;
                    }
                }

                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE) return "";

        return s.substring(res[0], res[1] + 1);
    }
}