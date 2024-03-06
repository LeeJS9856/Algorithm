N = int(input())
arrN = list(map(int, input().split()))
M = int(input())
arrM = list(map(int, input().split()))

def bin_search(arr, start, end, num) :
    if start > end :
        print(0)
        return

    center = (start + end)//2
    if arr[center] > num :
        bin_search(arr, start, center-1, num)
    elif arr[center] < num :
        bin_search(arr, center+1, end, num)
    else :
        print(1)
        return


sort_arrN = sorted(arrN)

for i in arrM :
    bin_search(sort_arrN, 0, len(sort_arrN)-1, i)