m = int(input())
n = int(input())

decimal = [True for i in range(n+1)] #인덱스를 n까지 받기위해 n+1개의 리스트를 생성
decimal[0], decimal[1] = False, False #0과 1은 소수가아님
decimal_number = []
for i, j in enumerate(decimal):
    if j == False : #소수가 아니면 패스
        continue

    count = 2
    while(i*count <= n) :
        decimal[i*count] = False
        count += 1

sum = 0
min = -1
for i in range(m, n+1) :
    if decimal[i] :
        if min == -1 :
            min = i
        sum += i

if min != -1 :
    print(sum)
print(min)

