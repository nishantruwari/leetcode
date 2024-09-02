class Solution {
    public void rotate(int[] nums, int k) {
        if (k != 0 && nums.length > 1) {
            int n = nums.length;
            int[] ans = new int[n];
            k = k % n;
            if (k != 0) {
                for (int i = n - k, j = 0; j < n; i = (i + 1) % n, j++) {
                    ans[j] = nums[i];

                }
                for (int i = 0; i < n; i++) {
                    nums[i] = ans[i];
                }

            }

        }

    }
}
