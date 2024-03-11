N = int(input())
def is_diag(check, chess=[]) :
    for num, i in enumerate(chess) :
        if abs(len(chess) - num) == abs(check - i) :
            return True
    return False

def queen(chess = [], count = 0) :
    answer = 0
    if len(chess) == N :
        return 1
    for j in range(N) :
        if j not in chess and not is_diag(j, chess):
            chess.append(j)
            answer += queen(chess, count)
            chess.pop()
    return answer

print(queen())