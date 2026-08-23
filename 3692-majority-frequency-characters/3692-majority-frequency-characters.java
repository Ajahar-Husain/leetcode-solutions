class Solution {
    public String majorityFrequencyGroup(String s) {

        int[] freq= new int[26];
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
        int[] count=new int[s.length()+1];
        for(int i=0; i<26;i++){
            if(freq[i] > 0){
                count[freq[i]]++;
            }
        }
        int best=0;
        for(int k=1; k<=s.length(); k++){
            if(count[k]>count[best] || (count[k]==count[best] && k> best)){
                best=k;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<26; i++){
            if(freq[i] == best){
                ans.append((char)('a' + i));
            }
        }
        return ans.toString();
    }
}