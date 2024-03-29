class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] arr = new int[nums.length];

        Arrays.sort(nums);
        helper(nums, 0, false, arr, 0, res);

        return res;
    }

    public void helper(int[] nums, int cur, boolean taken, int[] arr, int idx, List<List<Integer>> res) {
        if(cur == nums.length) {
            List<Integer> add = new ArrayList<>();
            for (int i = 0; i < idx; i++) {
                add.add(arr[i]);
            }
            res.add(add);
            return;
        }

        if(!(cur > 0 && !taken && nums[cur - 1] == nums[cur])) {
            arr[idx] = nums[cur];
            helper(nums, cur + 1, true, arr, idx + 1, res);
        }
        helper(nums, cur + 1, false, arr, idx, res);
    }
}