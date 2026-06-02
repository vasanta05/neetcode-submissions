class Solution {
    public int maxSubArray(int[] a) {
        if(a.length==1) return a[0];
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            max=Math.max(max,sum);
            if(sum<0) sum=0;
        }
        return max;
    }
}
