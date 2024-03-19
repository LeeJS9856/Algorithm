def solution(arr):
    for num_i,i in enumerate(arr) :
        for num_j,j in enumerate(i) :
            if arr[num_i][num_j] != arr[num_j][num_i] :
                return 0
    return 1