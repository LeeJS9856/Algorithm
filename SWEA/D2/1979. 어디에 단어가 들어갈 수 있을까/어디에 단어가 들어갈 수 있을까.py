T = int(input())
for test_case in range(1, T + 1):
    N, K = list(map(int, input().split(' ')))
    table = []
    for i in range(N) :
        a= list(input().split(' '))
        table.append(a)

    cnt = 0
    for i in range(len(table)) :
        combo_x= 0
        combo_y= 0
        combo_list_x = []
        combo_list_y = []
        for j in range(len(table)) :
            if table[i][j] == '1' :
                combo_x += 1
            else :
                combo_list_x.append(combo_x)
                combo_x = 0

            if table[j][i] == '1' :
                combo_y += 1
            else :
                combo_list_y.append(combo_y)
                combo_y = 0

            if j == len(table)-1 :
                if combo_x != 0 :
                    combo_list_x.append(combo_x)
                if combo_y != 0 :
                    combo_list_y.append(combo_y)
                cnt += combo_list_x.count(K) + combo_list_y.count(K)

    print(f"#{test_case} {cnt}")