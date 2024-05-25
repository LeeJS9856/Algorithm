i = int(input())
arr = [['*' for k in range(i*2-1)] for j in range(i*2-1)]
for j in range(i-1):
    for k in range(i-j-1):
        arr[j][k] = ' '
        arr[j][-k-1] = ''
        arr[-j-1][k] = ' '
        arr[-j-1][-k-1] = ''

for j in range(i*2-1):
    print(''.join(arr[j]))