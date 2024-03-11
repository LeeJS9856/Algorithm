N = int(input())
M = int(input())

com_list = [[] for i in range(N)]

for i in range(M) :
    com1, com2 = list(map(int, input().split(' ')))
    if com2 not in com_list[com1-1] :
        com_list[com1-1].append(com2)
    if com1 not in com_list[com2-1] :
        com_list[com2-1].append(com1)

def dfs(virus = [],start = 1) :
    if start in virus :
        return
    virus.append(start)
    for i in com_list[start-1] :
        dfs(virus,i)

list = []
dfs(list)
print(len(list)-1)