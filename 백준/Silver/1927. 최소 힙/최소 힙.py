import heapq
import sys

heap = []
n = int(sys.stdin.readline())
for i in range(n):
    num = int(sys.stdin.readline())
    if num==0:
        print(f"{0 if len(heap)==0 else heapq.heappop(heap)}")
    else :
        heapq.heappush(heap, num)