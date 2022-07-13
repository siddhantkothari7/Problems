### Leetcode Problem 3

def LengthOfLongestSubstring(str):
    arr = []
    if str == "":
        return 0
    else:
        temp = 0
        for i in range(len(str)):
            if str[i] not in arr:
                arr.append(str[i])
                print(arr)
            else:
                for j in range(len):
                    arr = [str[0], str[i]]
                    print(arr)
    return len(arr)


s1 = "abcabcbb"
s2 = "bbbbb"
s3 = "pwwkew"
s4 = "dvdf" 

print(LengthOfLongestSubstring(s1))