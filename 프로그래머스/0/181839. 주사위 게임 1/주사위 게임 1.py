def solution(a, b):
    if a*b % 2 == 1 :
        return a**2 + b**2
    elif (a+b) % 2 == 1 :
        return 2*(a+b)
    else :
        return a-b if a>b else b-a