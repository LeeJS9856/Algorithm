def solution(age):
    alpha = 'abcdefghij'      
    answer_list = [alpha[int(i)] for i in list(str(age))]
    return ''.join(answer_list)