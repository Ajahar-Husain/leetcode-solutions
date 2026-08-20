class Solution {
    public void wiggleSort(int[] nums) {
        
        int n= nums.length;
        Arrays.sort(nums);

        int [] temp =nums.clone();
        int mid=(n+1)/2;
        int right=n;

        for(int i=0; i<n; i++){
            if(i %2==0){
                mid--;
                nums[i]=temp[mid];
            }else{
                right--;
                nums[i]=temp[right];
            }
        }
    }
}