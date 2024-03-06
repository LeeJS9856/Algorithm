#최댓값
max = 0
x = 1
y = 1

for i in range(9) :
    row = list(map(int, input().split(' ')))
    for j in range(9) :
        if row[j] > max :
            max = row[j]
            x = i+1
            y = j+1

print(max)
print(f"{x} {y}")