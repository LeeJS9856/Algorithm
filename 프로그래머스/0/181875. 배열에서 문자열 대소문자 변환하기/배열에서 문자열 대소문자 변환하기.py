def solution(strArr):
    answer = []
    for index,k in enumerate(strArr) :
        if index % 2 == 1 :
            answer.append(k.upper())
        else :
            answer.append(k.lower())
    return answer