def dp(n) :
    if n >= 2:
        dp_list = [0 for i in range(n+1)]
        dp_list[1] = 0
        for i in range(2,n+1) :
            min = dp_list[i-1]
            if i % 3 == 0 :
                min = min if min < dp_list[i//3] else dp_list[i//3]
            if i % 2 == 0 :
                min = min if min < dp_list[i//2] else dp_list[i//2]

            dp_list[i] = min + 1
        return dp_list[n]
    else :
        return 0


n = int(input())
print(dp(n))