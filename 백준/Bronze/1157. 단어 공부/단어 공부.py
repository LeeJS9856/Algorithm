import sys

a = sys.stdin.readline().strip().upper()
alpha_list = {}
for i in a:
    if i in alpha_list:
        alpha_list[i] += 1
    else:
        alpha_list[i] = 1

max_count = max(alpha_list.values()) #딕셔너리 값중 가장 큰 값을 찾음
ans = ''
for i in alpha_list:
    if alpha_list[i] == max_count: 
        if ans == '':
            ans = i
        else: #max값이 존재할경우, ? 출력
            ans = '?'
            break
print(ans)
