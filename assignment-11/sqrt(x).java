class Solution {
    public int mySqrt(int x) {
      if (x == 0 || x ==1){
          return x;
      }
      else{

          int start = 1, end = x;
            while (start <= end){
                int mid = (start + end )/2;
                int guess = mid * mid;
                if (guess <= x){
                    start = mid+1;
                    

                }
                else{
                    end = mid -1;
                }
            }
            return end;

      }
    }
}