n = int(input())
for i in range(n) :
    arr = []
    for j in range(i+1) :
        arr.append('*')
    print(''.join(arr))
for i in range(n-1) :
    arr = []
    for j in range(n-i-1) :
        arr.append('*')
    print(''.join(arr))