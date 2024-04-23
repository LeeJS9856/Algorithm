def solution(strArr):
    len_dict = {}
    for i in strArr :
        if len(i) not in len_dict :
            len_dict[len(i)] = 1
        else :
            len_dict[len(i)] += 1
    return max(len_dict.values())