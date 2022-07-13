### Leetcode 41

def firstMissingPositive(nums):
    thisset = set()
    for num in nums:
        thisset.add(num)

    i = 1
    while(True):
        if i in thisset:
            i += 1
        else:
            return i
        

nums1 = [1,2,0]
nums2 = [3,4,-1,1]
nums3 = [7,8,9,11,12]

print(firstMissingPositive(nums3))

    
