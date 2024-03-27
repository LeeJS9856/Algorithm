def solution(a, d, included):
    sum = 0
    for num, i in enumerate(included) :
        if i :
            sum += a + d * num
    return sum