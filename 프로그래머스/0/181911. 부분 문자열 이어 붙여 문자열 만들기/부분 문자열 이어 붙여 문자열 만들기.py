def solution(my_strings, parts):
    return ''.join(i[0][i[1][0]:i[1][1]+1] for i in zip(my_strings, parts))