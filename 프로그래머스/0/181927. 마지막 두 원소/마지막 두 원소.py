def solution(num_list):
    tmp = num_list[len(num_list)-2:len(num_list)]
    if tmp[1] > tmp[0] :
        num_list.append(tmp[1]-tmp[0])
    else :
        num_list.append(tmp[1]*2)
    return num_list