class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result= new ArrayList<>();
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num: map.keySet()){
            if(map.get(num)> nums.length/3){
                result.add(num);
            }
        }
        return result;
        
    }
}