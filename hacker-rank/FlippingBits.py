#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'flippingBits' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts LONG_INTEGER n as parameter.
#

def flippingBits(n):
    # Write your code here
    bin_num = bin(n)[2:].zfill(32)
    #print("Binary number is: ", bin_num)
    ret = ""
    for i in range(len(bin_num)):
        if bin_num[i] == "1":
            ret += "0"
        else:
            ret += "1"
    #print("Flipped Binary number is: ",ret)
    return int(ret,2)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        n = int(input().strip())

        result = flippingBits(n)

        fptr.write(str(result) + '\n')

    fptr.close()
