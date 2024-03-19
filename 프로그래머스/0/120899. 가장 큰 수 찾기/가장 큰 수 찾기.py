def solution(array):
    max = 0
    for num, i in enumerate(array) :
        if i > max :
            max = i
            answer = [i, num]
    return answer