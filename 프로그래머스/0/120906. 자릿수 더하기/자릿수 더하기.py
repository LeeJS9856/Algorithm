def solution(n):
    n = str(n)
    sum = 0
    for i in range(len(n)) :
        tmp = int(n[i])
        sum += tmp
    return sum