def solution(myString):
    answer = ''
    for i in range(len(myString)):
        if ord('a') <= ord(myString[i]) <= ord('z') :
            answer += myString[i].upper()
        else :
            answer += myString[i]
    return answer