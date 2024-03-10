n, m = map(int, input().split())

def find_num(arr = []) :
    if len(arr) == m :
        print(" ".join(map(str, arr)))
    else :
        for i in range(1,n+1) :
            if len(arr) != 0 and arr[-1] > i:
                continue
            if i not in arr:
                arr.append(i)
                find_num(arr)
                arr.pop()

find_num()
