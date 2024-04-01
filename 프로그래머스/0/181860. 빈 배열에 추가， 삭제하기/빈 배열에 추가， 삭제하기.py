def solution(arr, flag):
    X = []
    for i , j in zip(arr, flag) :
        if j :
            X += [i] * i * 2
        else :
            X = X[:-i]
    return X
            