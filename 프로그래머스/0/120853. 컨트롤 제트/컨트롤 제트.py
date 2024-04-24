def solution(s):
    list_x = []
    for i in s.split(' ') :
        if i == 'Z' :
            list_x.pop()
        else :
            list_x.append(int(i))
    return sum(list_x)