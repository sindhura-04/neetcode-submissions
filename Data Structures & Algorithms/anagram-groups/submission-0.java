class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs)
        {
            int a[]=new int[26];
            for(char ch:s.toCharArray())
                a[ch-'a']++;
            StringBuilder sb=new StringBuilder();
            for(int c:a)
            {
                sb.append("#");
                sb.append(c);
            }
            String key=sb.toString();
            if(!hm.containsKey(key))
                hm.put(key,new ArrayList<String>());
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
