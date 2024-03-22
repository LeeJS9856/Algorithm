def solution(n):
    answer_list = [[1 if i==j else 0 for i in range(n) ] for j in range(n)]
    return answer_list