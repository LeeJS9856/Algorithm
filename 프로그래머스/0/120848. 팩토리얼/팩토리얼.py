def solution(n):
    pac = 1
    for i in range(1,11):
        pac *= i
        if pac > n :
            return i-1
        elif pac == n :
            return i