def solution(my_string, is_prefix):
    for i in range(len(my_string)) :
        if is_prefix == my_string[0:i] :
            return 1
    return 0