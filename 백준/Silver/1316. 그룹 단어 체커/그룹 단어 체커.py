import sys

n = int(input())
countGroupWord = 0
for i in range(n):
    word = sys.stdin.readline().strip()
    alpha_list = [] #중복확인하는 리스트
    isGroupWord = True
    lastWord = ''
    for j in word :
        if j not in alpha_list: 
            alpha_list.append(j)
            lastWord = j
        elif j == lastWord :
            continue
        else :
            isGroupWord = False
            break
    
    if isGroupWord:
        countGroupWord += 1

print(countGroupWord)