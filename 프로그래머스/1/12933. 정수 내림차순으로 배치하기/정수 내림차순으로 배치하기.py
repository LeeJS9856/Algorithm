def solution(n):
    n_list = sorted(list(str(n)))
    return int(''.join(n_list[::-1]))