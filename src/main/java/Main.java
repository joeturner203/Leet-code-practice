void main() {
    IO.println(singleNumber(new int[]{1,2,3,4,5,1,2,3,4}));
}

public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
        result ^= num; // XOR accumulates the unique number
    }
    return result;
}

public boolean isPalindrome(int x) {
    if(x < 0) return false;
    if (x == 0) return true;
    if (x % 10 == 0) return false;
    int reverseNum = 0;

    while(reverseNum < x) {
        int digit = x % 10;
        x = x / 10;
        reverseNum = reverseNum * 10 + digit;
    }

    if (reverseNum > x) {
        reverseNum = reverseNum / 10;
    }

    return reverseNum == x;
}
public int[] twoSum(int[] nums, int target) {
    Map <Integer,Integer> complement = new HashMap<>();
    for (int i = 0; i < nums.length; i++){
        if (complement.get(nums[i]) != null){
            return new int[] {complement.get(nums[i]),i};
        }else{
            complement.put(target - nums[i], i);
        }
    }
    return nums;
}
