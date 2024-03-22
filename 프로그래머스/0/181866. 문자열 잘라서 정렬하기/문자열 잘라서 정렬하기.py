def solution(myString):
    ans_list = myString.split('x')
    return [i for i in sorted(ans_list) if i != '']