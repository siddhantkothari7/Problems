### Leetcode 34

def searchRange(nums, target):
    i = 0 
    j = len(nums) - 1

    if len(nums) == 0:
        return [-1,-1]
    if len(nums) == 1 and nums[0] == target:
        return[0,0]
    if len(nums) == 1 and nums[0] != target:
        return [-1,-1]

    while(i < j):
        if nums[i] != target:
            i += 1
        if nums[j] != target:
            j -= 1
        if nums[i] == target and nums[j] == target:
            return [i,j]
    return [-1,-1]

nums = [5,7,7,8,8,10]
target = 6

print(searchRange(nums, target))
        


        