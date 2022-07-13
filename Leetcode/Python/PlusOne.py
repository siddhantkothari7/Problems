### Leetcode Problem 66

# def PlusOne(digits):
#     if digits[-1] != 9 and len(digits) <= 1:
#         digits[-1] += 1
#     elif digits[-1] 
#     else:
#         PlusOne(digits[:-1])



def PlusOne(digits):
    n = len(digits) - 1
    tot = 0
    for num in digits:
        tot += num * pow(10, n)
        n -= 1

    tot += 1

    ret = []
    a = len(digits) - 1
    while(tot != 0):
        ret.append(tot// pow(10,a))
        tot = tot % pow(10, a)
        a -= 1

    return ret




d1 = [1,2,3]
d2 = [4,3,2,1]
d3 = [0]

print(PlusOne(d2))