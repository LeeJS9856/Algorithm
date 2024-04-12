def solution(s):
    dict  = {}
    for i in s :
        dict[i] = dict[i]+1 if i in dict else 1
    answer = ''.join(sorted(list(i for i in dict if dict[i] == 1)))
    return answer
            