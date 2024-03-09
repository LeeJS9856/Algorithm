n = int(input())
cnt = 0
for i in range(n) :
    stack = []
    word = input()
    for j in word :
        if j == 'A' :
            if len(stack) == 0 or stack[-1] == 'B' :
                stack.append(j)
            else :
                stack.pop()
        else :
            if len(stack) == 0 or stack[-1] == 'A':
                stack.append(j)
            else :
                stack.pop()
    if len(stack) == 0 :
        cnt += 1
print(cnt)