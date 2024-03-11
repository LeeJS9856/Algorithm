def solution(my_string):
    my_string = my_string.split(' ')
    my_string = list(i for i in my_string if i != "")
    return my_string