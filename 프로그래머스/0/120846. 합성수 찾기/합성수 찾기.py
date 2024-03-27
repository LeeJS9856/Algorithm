def solution(n):
    sum = 0
    for i in range(4,n+1) :
        for j in range(2, i):
            if i % j == 0 :
                sum += 1
                break
    return sum