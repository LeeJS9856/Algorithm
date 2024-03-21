def solution(n, answer_list = []):
    n=int(n)
    answer_list.append(n)
    if n==1 :
        return answer_list
    if n%2==0 :
        solution(n/2, answer_list)
    else :
        solution(3*n+1, answer_list)
    return answer_list