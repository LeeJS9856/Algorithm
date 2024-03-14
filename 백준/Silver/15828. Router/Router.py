import sys
from queue import Queue


n = int(sys.stdin.readline())
q = Queue(n)
while(True) :
    num = int(sys.stdin.readline())
    if num == -1 :
        break
    elif not q.empty() and num == 0:
        q.get()
    elif not q.full():
        q.put(num)

if q.empty() :
    print("empty")
else :
    q_list = list(q.get() for i in range(q.qsize()))
    print(' '.join(map(str, q_list)))
