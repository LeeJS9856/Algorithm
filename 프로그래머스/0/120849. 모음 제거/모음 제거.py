def solution(my_string):
    vow = ['a', 'e', 'i', 'o', 'u']
    answer = ''
    for i in range(len(my_string)) :
        if my_string[i] in vow :
            continue
        else :
            answer += my_string[i]
    return answer