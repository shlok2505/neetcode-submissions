class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[]alph=new int[26];
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            alph[ch]++;
        }
        for(int i=0;i<t.length();i++){
            int ch=t.charAt(i)-'a';
            if(alph[ch]>0){
                alph[ch]--;
            }else return false;

        }
        return true;
    }
}
