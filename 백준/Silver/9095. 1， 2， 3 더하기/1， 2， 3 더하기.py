def dp(n) :
    dp_list = [0 for i in range(11)]
    dp_list[0] = 1
    dp_list[1] = 2
    dp_list[2] = 4
    for i in range(3,n) :
        dp_list[i] = dp_list[i-1] + dp_list[i-2] +dp_list[i-3]
    return dp_list[n-1]

t = int(input())
for i in range(t) :
    n = int(input())
    print(dp(n))