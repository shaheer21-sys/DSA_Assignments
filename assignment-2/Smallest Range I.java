class Solution {
public:
    int smallestRangeI(vector<int>& nums, int k) {
        int nsize = nums.size();
        int max=nums[0];
        int min=nums[0];
        for(int i=1; i<nsize; i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        int diff=max-min;
        if(diff<=2*k)
        {
            return 0;
        }
        else
        {
            return diff-2*k;
        }
    }
};