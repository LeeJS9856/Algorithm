import math


def solution(n):
    for i in range(math.floor(n**(1/2)), math.floor(n**(1/2))+1): #루트 n이 정수인지 판별
        if i**2 == n:
            return 1
        else :
            return 2