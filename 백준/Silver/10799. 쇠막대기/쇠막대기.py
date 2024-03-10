iron = list(input())
sum, part = 0, 0
save = ''
for i in iron :
    if i == '(' :
        part += 1
    else :
        part -= 1
        if save == '(' :
            sum += part
        else :
            sum += 1
    save = i
print(sum)