import math
def solution(arr):
    to_add = 2**int(math.ceil(math.log2(len(arr)))) - len(arr)
    return arr+[0]*to_add