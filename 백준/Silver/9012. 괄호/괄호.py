t = int(input())
for i in range(t) :
    stack = []
    x = input()
    isVPS = True
    for j in x :
        if j == '(' :
            stack.append(j)
        else :
            if len(stack) == 0 :
                isVPS = False
                break
            stack.pop()
    if isVPS and len(stack) == 0:
        print('YES')
    else :
        print('NO')

