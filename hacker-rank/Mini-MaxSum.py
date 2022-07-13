# Easy
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    # Write your code here
    arr.sort()
    i = 0
    j = -1
    min_sum= 0
    max_sum= 0
    for k in range(4):
        min_sum += arr[i]
        max_sum += arr[j]
        i += 1
        j -= 1
    print(min_sum, max_sum)




if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
