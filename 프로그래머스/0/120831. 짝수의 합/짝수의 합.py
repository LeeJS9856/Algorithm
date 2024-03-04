def solution(n):
    sum = 0
    for i in range(2, n+1, 2) :
        sum = sum + i
    return sum