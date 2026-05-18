class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int suff[]=new int[n];
        int prif[]=new int[n];
        int a[]=new int[n];
        prif[0]=nums[0];suff[n-1]=nums[n-1];
        for(int i=1;i<nums.length;i++)
            prif[i]=prif[i-1]*nums[i];
        for(int i=n-2;i>=0;i--)
            suff[i]=suff[i+1]*nums[i];
        for(int i=0;i<n;i++)
        {
            if(i==0)
                a[i]=suff[i+1];
            else if(i==n-1)
                a[i]=prif[i-1];
            else
                a[i]=prif[i-1]*suff[i+1];
        }
        return a;
    }
}  
