def solution(my_string):
    for i in my_string :
        if i.isalpha() :
            my_string = my_string.replace(i, ' ')
    return sum([int(i) for i in my_string.split(' ') if i])