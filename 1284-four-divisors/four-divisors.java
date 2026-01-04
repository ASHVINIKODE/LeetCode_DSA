class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            int count = 0;
            int divSum = 0;
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    int other = num / i;
                    if (i == other) {
                        count++;
                        divSum += i;
                    } else {
                        count += 2;
                        divSum += i + other;
                    }
                    if (count > 4) {
                        break;
                    }
                }
            }
            if (count == 4) {
                totalSum += divSum;
            }
        }
        return totalSum;
    }
}