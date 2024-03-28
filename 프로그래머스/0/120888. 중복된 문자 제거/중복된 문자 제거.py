def solution(my_string):
    answer_list = ''
    for i in my_string :
        if i not in answer_list :
            answer_list+=i
    return answer_list