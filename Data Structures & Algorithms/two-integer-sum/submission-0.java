class Solution {
    public int[] twoSum(int[] a, int t) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<a.length;i++)
        {
            if(h.containsKey(t-a[i]))
            {
                res[0]=h.get(t-a[i]);
                res[1]=i;
            }
            else{
                h.put(a[i],i);
            }
        }
        return res;
    }
}
