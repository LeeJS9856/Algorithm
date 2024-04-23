def solution(arr):
    two_list = [num for num,i in enumerate(arr) if i == 2]
    return arr[two_list[0]:two_list[-1]+1] if len(two_list) != 0 else [-1]