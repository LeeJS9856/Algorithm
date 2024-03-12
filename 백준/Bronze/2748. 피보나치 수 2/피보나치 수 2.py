def fib_dp(n) :
    fib_list = [0 for i in range(n+1)]
    fib_list[0], fib_list[1] = 0,1
    for i in range(2,n+1) :
        fib_list[i] = fib_list[i-1] + fib_list[i-2]
    return fib_list[n]

n = int(input())
print(fib_dp(n))