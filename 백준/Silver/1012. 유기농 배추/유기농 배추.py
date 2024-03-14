import sys
import queue

def bfs(i,j) :
    q = queue.Queue()
    q.put((i, j))
    field[i][j] = 0
    while (True):
        if q.empty():
            return 1
        else:
            i, j = q.get()
            for x, y in ([i + 1, j], [i - 1, j], [i, j + 1], [i, j - 1]):
                if 0 <= x < N and 0 <= y < M and field[x][y]:
                    q.put((x, y))
                    field[x][y] = 0

T = int(sys.stdin.readline())
for t in range(T) :
    M,N,K = list(map(int,sys.stdin.readline().split()))
    field = [[0 for i in range(M)] for j in range(N)]
    for i in range(K) :
        x,y = list(map(int,sys.stdin.readline().split()))
        field[y][x] = 1

    cnt = 0
    for i in range(N) :
        for j in range(M) :
            if field[i][j] == 1:
                cnt += bfs(i,j)
    print(cnt)