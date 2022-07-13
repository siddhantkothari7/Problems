### Leetcode 16

def threeSumClosest(nums, target):
    nums.sort()
    sum = float('inf')

    for i in range(len(nums)-1):
        m,r = i + 1, len(nums) - 1
        while(m < r):
            temp_sum = nums[i] + nums[m] + nums[r]
            if temp_sum == target:
                return temp_sum
            elif abs(temp_sum - target) < abs(sum - target):
                sum = temp_sum
            if temp_sum < target:
                m += 1
            else:
                r -= 1
    return sum


nums = [-1,2,1,-4]
target = 1

print(threeSumClosest(nums, target))