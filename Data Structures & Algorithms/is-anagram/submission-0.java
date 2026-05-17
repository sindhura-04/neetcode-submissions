class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()==t.length())
        {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            Integer c=hm.get(ch);
            if(c==null||c==0)
                return false;
            hm.put(ch,c-1);
        }
        return true;
        }
        else
            return false;

    }
}
