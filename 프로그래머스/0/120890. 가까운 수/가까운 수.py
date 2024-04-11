def solution(array, n):
    arr_min = 100
    answer = 0
    array = sorted(array)
    for i in array :
        if abs(i-n) < arr_min :
            arr_min = abs(i-n)
            answer = i
    return answer