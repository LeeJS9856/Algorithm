a = int(input())
answer = 0
for i in range(1,a) :
    str_num = list(str(i))
    sum = 0
    for j in range(len(str_num)) :
        sum += int(str_num[j])
    if a == i + sum :
        answer = i
        break

print(answer)