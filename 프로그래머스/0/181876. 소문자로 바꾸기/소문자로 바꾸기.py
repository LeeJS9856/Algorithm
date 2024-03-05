def solution(myString):
    answer = ''
    for i in range(len(myString)):
        if ord('A') <= ord(myString[i]) <= ord('Z'):
            answer += chr(ord(myString[i])+ord('a')-ord('A'))
        else:
            answer += myString[i]
    return answer