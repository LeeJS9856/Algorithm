def solution(num_list, n):
    return [[num_list[i+j] for j in range(n)] for i in range(0,len(num_list), n)]