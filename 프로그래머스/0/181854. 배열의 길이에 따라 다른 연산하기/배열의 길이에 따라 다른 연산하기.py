def solution(arr, n):
    answer = []
    if len(arr) % 2 == 0:
        for num, i in enumerate(arr) :
            answer.append(i+n if num % 2 == 1 else i)
    else :
        for num, i in enumerate(arr) :
            answer.append(i+n if num % 2 == 0 else i)
    return answer