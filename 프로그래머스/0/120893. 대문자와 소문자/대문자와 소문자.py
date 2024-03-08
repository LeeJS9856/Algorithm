def solution(my_string):
    answer = ''
    for i in list(my_string) :
        answer += i.upper() if i.islower() else i.lower()
    return answer