def solution(n):
    div_list = [i for i in range(1,n+1) if n % i == 0]
    return sum(div_list)

#n==0일때는..?