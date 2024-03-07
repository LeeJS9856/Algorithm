def solution(my_string):
    number = ['0','1','2','3','4','5','6','7','8','9']
    return sum(list(int(i) for i in my_string if i in number))