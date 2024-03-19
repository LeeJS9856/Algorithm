def solution(arr, idx):
    for num, i in enumerate(arr[idx:], idx) :
        if i == 1 :
            return num
    return -1