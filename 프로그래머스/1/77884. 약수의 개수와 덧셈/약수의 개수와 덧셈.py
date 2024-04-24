def solution(left, right):
    sum = 0
    for i in range(left, right+1) :
        if (i ** (1/2)) == int(i ** (1/2)):
            sum -= i
        else :
            sum += i
    return sum