class Solution {
    public boolean hasDuplicate(int[] a) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:a)
        {
            if(h.contains(i)) return true;
            h.add(i);
        }
        return false;
    }
}