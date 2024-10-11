n = int(input())
for i in range(n) :
    arr = []
    space = n - i -1
    for j in range(space):
        arr.append(' ')
    for j in range(i*2+1) :
        arr.append('*')
    print(''.join(arr))