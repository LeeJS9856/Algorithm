def fib(n) :
    global cnt
    cnt = 0
    if n==1 or n==2 :
        return 1
    else :
        cnt += 1
        return (fib(n-1) + fib(n-2))

def fib_dp(n) :
    fib_list = [0 for i in range(n)]
    fib_list[0], fib_list[1] = 1,1
    cnt = 0
    for i in range(2,n) :
        fib_list[i] = fib_list[i-1] + fib_list[i-2]
        cnt += 1
    return cnt

n = int(input())
print(fib(n))
print(fib_dp(n))