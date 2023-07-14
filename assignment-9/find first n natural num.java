package assignment-9;

public class find first n natural num {
    static int findSum(int n)
    {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }
 
    // Driver code
    public static void main(String args[])
    {
        int n = 5;
        System.out.println(findSum(n));
    }
}
