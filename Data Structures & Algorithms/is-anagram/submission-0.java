class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0; i<s.length(); i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<t.length(); i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }

        for(char x:map1.keySet()){
            int freq=map1.get(x);

            if(!map2.containsKey(x)||map2.get(x)!=freq){
                return false;
            }
        }
        return true;
    }
}
