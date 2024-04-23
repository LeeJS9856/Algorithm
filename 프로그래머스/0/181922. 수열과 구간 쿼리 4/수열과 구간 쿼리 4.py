def solution(arr, queries):
    for i in queries :
        for j in range(i[0], i[1]+1) :
            if j==0 or j % i[2] == 0 :
                arr[j] += 1
    return arr