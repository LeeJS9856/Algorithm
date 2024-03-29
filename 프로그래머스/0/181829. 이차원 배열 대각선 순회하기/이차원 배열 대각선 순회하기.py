def solution(board, k):
    sum = 0
    for num1, i in enumerate(board) :
        for num2, j in enumerate(i) :
            if num1 + num2 <= k :
                sum+=j
    return sum