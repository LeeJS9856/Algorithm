def solution(my_string, indices):
    bool_list = [1 for i in my_string]
    answer = ''
    for i in indices :
        bool_list[i] = 0
    return ''.join(list(i[1] for i in zip(bool_list, my_string) if i[0]))
         