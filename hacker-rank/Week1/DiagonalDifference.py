#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'diagonalDifference' function below.
#
# The function is expected to return an INTEGER.
# The function accepts 2D_INTEGER_ARRAY arr as parameter.
#

def diagonalDifference(arr):
    # Write your code here
    i = 0
    j = len(arr) - 1
    rd_sum = 0
    ld_sum = 0
    for k in range(len(arr)):
        ld_sum += arr[k][i]
        rd_sum += arr[k][j]
        i += 1
        j -= 1
    return abs(rd_sum - ld_sum)



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    result = diagonalDifference(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
