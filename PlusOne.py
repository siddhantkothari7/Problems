### Leetcode Problem 66

def PlusOne(digits):
    if digits[-1] != 9 and len(digits) <= 1:
        digits[-1] += 1
    elif digits[-1] 
    else:
        PlusOne(digits[:-1])




    # i = -1
    # if digits[i] != 9:
    #     digits[i] += 1
    # else:
    #     i -= 1



d1 = [1,2,3]
d2 = [4,3,2,1]
d3 = [0]

print(PlusOne(d1))