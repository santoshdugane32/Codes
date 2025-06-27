class Leetcode1011{
        public int shipWithinDays(int[] weights, int days) {
        int s=0,e=0,ans=0;
     for(int i:weights){
        s=Math.max(s,i);
        e+=i;
     }
     while(s<=e){
        int mid=(s+e)/2;
        if(ispossible(weights,days,mid)){
            ans=mid;e=mid-1;
        }
        else s=mid+1;
     }
     return ans;
    }
    public boolean ispossible(int nums[],int k,int mid){
        int currsum=0;
        int ele=1;
            for(int i:nums){
                if(currsum+i>mid){
                    ele++;
                    currsum=i;
                    if(ele>k)return false;
                    
                }
                else{
                    currsum+=i;
                }
            }
            return true;
    }
}
