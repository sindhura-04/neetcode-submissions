class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        List<List<Integer>> o=new ArrayList<>();
        int n=0;
        for(int key:hm.keySet())
        {
            List<Integer> i=new ArrayList<>();
            i.add(key);
            i.add(hm.get(key));
            o.add(i);
        }
        Collections.sort(o, new Comparator<List<Integer>>() 
        {
            public int compare(List<Integer> a, List<Integer> b)
            {
                return b.get(1) - a.get(1);
            }
        });
        int a[]=new int[k];
        for(int i=0;i<k;i++)
        {
            a[i]=o.get(i).get(0);
        }
        return a;
    }
}
