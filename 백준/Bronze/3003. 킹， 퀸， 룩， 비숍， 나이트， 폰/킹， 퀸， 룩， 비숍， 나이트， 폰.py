i = list(map(int, input().split(' ')))
chess = [1,1,2,2,2,8]
print(' '.join([str(j[1] - j[0]) for j in zip(i, chess)]))