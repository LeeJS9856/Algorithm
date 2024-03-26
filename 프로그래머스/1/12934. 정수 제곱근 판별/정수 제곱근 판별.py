def solution(n):
    x = int(n**(1/2))
    return (x+1)**2 if x**2 == n else -1