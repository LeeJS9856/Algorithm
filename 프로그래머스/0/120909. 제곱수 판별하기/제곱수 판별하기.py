def solution(n):
    for i in range(int(n**(1/2)), int(n**(1/2))+1): #루트 n이 정수인지 판별
        return 1 if i**2 == n else 2