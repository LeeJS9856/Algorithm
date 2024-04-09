def solution(i, j, k):
    sum = 0
    for i in range(i,j+1) :
        sum += list(str(i)).count(str(k))
    return sum