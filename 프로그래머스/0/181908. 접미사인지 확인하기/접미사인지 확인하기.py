def solution(my_string, is_suffix):
    for i in range(len(my_string)) :
        if is_suffix == my_string[i:len(my_string)] :
            return 1
    return 0