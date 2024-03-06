#색종이

num = int(input())

arr = [[False for j in range(100)] for i in range(100)] #이차원 배열 선언

for i in range(num) :
    xy = list(map(int, input().split(' ')))
    for j in range(10):
        for k in range(10):
            arr[xy[0]+j][xy[1]+k] = True

cnt = 0
for i in range(100) :
    for j in range(100) :
        if arr[i][j] :
            cnt += 1

print(cnt)