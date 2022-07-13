def LonelyInteger(a):
    a.sort()
    n = len(a)
    i = 0
    while(i < n):
        print("i is: ", i, "a[i] is: ", a[i])
        if(i == n-1):
            return a[i]
        if(a[i] == a[i+1]):
            i += 2
            continue
        else:
            return a[i]



a = [1,2,3,4,3,2,1]
print(LonelyInteger(a))