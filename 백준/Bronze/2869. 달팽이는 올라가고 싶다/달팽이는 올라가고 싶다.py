import sys, math

a, b, v = list(map(int, sys.stdin.readline().strip().split(' ')))
day = math.ceil((v - a) / (a - b))
print(day + 1)
