def minimizeMemory(processes, m):
    n = len(processes)
    i = 0
    j = i + m
     
    total_sum = sum(processes) ## O(n) 
    max_sum = sum(processes[i:j]) ##O(n)
    tmp_sum = max_sum
    
    while(j < n):  ## O(n-m)
        tmp_sum -= processes[i]
        tmp_sum += processes[j]
        if(tmp_sum > max_sum):
            max_sum = tmp_sum
        
        i += 1
        j += 1 

    return total_sum - max_sum


##O(n)


## Outputs 22
processes = [10,4,8,13,20]
m = 2


processes1 = [10,4,8,1]
m1 = 2

processes2 = [4,6,10,8,2,1]
m2 = 3

assert minimizeMemory(processes, m) == 22
print(True) 

assert minimizeMemory(processes1, m1) == 9
print(True)

assert minimizeMemory(processes2, m2) == 7
print(True)
