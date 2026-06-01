class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char []one=s1.toCharArray();
        Arrays.sort(one);
        String s11=new String(one);
        int n=s1.length();
        for(int i=0;i<=s2.length()-n;i++)
        {
            String two=s2.substring(i,i+n);
            char []sample=two.toCharArray();
            Arrays.sort(sample);
            String sample1=new String(sample);
            if(s11.equals(sample1)) return true;
        }
        return false;
    }
}
