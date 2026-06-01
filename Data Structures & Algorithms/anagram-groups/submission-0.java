class Solution {
    public List<List<String>> groupAnagrams(String[] a) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String s:a)
        {
            char []one=s.toCharArray();
            Arrays.sort(one);
            String sorted=new String(one);
            if(h.containsKey(sorted))
            {
                h.get(sorted).add(s);
            }
            else{
                ArrayList<String> al=new ArrayList<>();;
                al.add(s);
                h.put(sorted,al);
            }
        }
        return new ArrayList<>(h.values());
    }
}
