import sys

def meeting(start = 0, index = 0, count = 0) :

    return count


N = int(sys.stdin.readline())
meeting_time = []
for i in range(N) :
    start, end = map(int, sys.stdin.readline().split(' '))
    meeting_time.append((start, end))

meeting_time.sort(key=lambda x:(x[1],x[0]))
index, count, start = 0,0,0
while(True) :
    toggle = True
    for i in range(index, len(meeting_time)) :
        if meeting_time[i][0] >= start : #겹치지 않도록
            count += 1
            index += 1
            start = meeting_time[i][1]
            toggle = False
            break
    if toggle :
        break
print(count)


