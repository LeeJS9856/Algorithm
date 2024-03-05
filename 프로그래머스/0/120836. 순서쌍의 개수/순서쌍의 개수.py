def solution(n):
    cnt = 0
    sq_num = False
    for i in range(1,round(n**(1/2)) +1) :
        if i**2 == n : #제곱수
            sq_num = True
        elif n % i == 0 :
            cnt += 1

    if sq_num :
        return cnt*2 +1
    else :
        return cnt *2