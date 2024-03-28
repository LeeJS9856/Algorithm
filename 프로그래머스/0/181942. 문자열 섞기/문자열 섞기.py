def solution(str1, str2):
    answer = ''
    for i in zip(str1, str2) :
        answer = answer + i[0] + i[1]
    return answer