class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> states = new HashSet<Integer>();
        List<Integer> result = new ArrayList<>();


        for (int num : nums) {
            if (states.contains(num)) {
                result.add(num);
            } else {
                states.add(num);
            }
        }

        return result;
    }
}