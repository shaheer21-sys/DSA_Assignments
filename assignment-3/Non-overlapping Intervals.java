class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->
        {
            if(a[1]>b[1])return 1;
            else if(a[1]==b[1])return 0;
            else return -1;
        });
        int c=1,d=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=d)
            {
                c+=1;
                d=intervals[i][1];
            }
        }
        return intervals.length-c;
    }
}