def getMinimumCost(parcels, k):
    n = len(parcels)
    min_sum = 0
    if(n==k): return min_sum
    i = 1
    num_rem = k-n

    checker = set()

    for j in parcels:
        checker.add(j)
    print(checker)

    while(num_rem > 0):
        if(not (i in checker)):
            min_sum += i
            num_rem -= 1
        i += 1
    return min_sum

    
        

## test Case 1 || Should output 17
parcels = [2,3,6,10,11]
k = 9

## test Case 2 || Should output 9
parcels1 = [6,5,4,1,3]
k1 = 7

## test Case 3 || SHould output 0
parcels2 = [4,5,7,1]
k2 = 4

print(getMinimumCost(parcels, k))


