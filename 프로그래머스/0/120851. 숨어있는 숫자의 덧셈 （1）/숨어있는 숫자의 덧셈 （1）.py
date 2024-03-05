def solution(my_string):
    number = ['0','1','2','3','4','5','6','7','8','9']
    sum = 0
    for i in my_string:
        if i in number:
            sum += int(i)
    return sum