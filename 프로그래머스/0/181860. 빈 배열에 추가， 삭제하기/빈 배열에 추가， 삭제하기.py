def solution(arr, flag):
    X = []
    for i in zip(arr, flag) :
        if i[1] :
            for j in range(i[0]*2) :
                X.append(i[0])
        else :
            for j in range(i[0]) :
                X.pop()
    return X
            