def solution(intStrs, k, s, l):
    a = [i[s:s+l] for i in intStrs]
    answer_list = [i for i in list(map(int,a)) if i > k]
    return answer_list