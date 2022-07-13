# Easy
#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    # Write your code here
    num_pos = 0
    num_neg = 0
    num_zer = 0
    arr_len = len(arr)
    for i in arr:
        if i > 0:
            num_pos += 1
        elif i < 0:
            num_neg += 1
        else:
            num_zer += 1
    print(round(num_pos/arr_len, 6))
    print(round(num_neg/arr_len,6))
    print(round(num_zer/arr_len,6))

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
