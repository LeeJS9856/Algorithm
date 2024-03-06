#랜선 자르기

def cut(arr, N, length) :
    sum = 0
    for i in arr :
        sum += i // length
    if N <= sum :
        return True
    else :
        return False


def bin(arr, start, end,N) :
    if start > end :
        return end
    middle = (start + end) // 2
    if cut(arr, N, middle) :
        start = middle + 1
    else :
        end = middle - 1
    return bin(arr, start, end, N)


K, N = map(int, input().split())

line = []
for i in range(K) :
    line.append(int(input()))

max_item = max(line)
sorted_line = sorted(line)
print(bin(sorted_line, 1, max_item, N))
