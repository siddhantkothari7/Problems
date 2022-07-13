### Leetcode Problem 4

def findMedianSortedArrays(nums1, nums2):
    tot_len = len(nums1) + len(nums2)
    fin_lst = nums1 + nums2
    fin_lst.sort()
    print(fin_lst)
    if (tot_len % 2 == 1):
        return fin_lst[tot_len//2]
    else:
        
        return (fin_lst[int(tot_len/2)-1] + fin_lst[int(tot_len/2)])/2



nums1 = [1,2]
nums2 = [3,4]

print(findMedianSortedArrays(nums1, nums2))