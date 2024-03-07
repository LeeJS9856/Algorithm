for i in range(1, 11) :
    length = int(input())
    table = []
    for j in range(8) :
        row = list(input())
        table.append(row)

    cnt = 0
    for m in range(8):
        for j in range(9-length) :
            is_pal_x = True
            is_pal_y= True
            for k in range(length) :
                if table[j+k][m] != table[length+j-1-k][m] :
                    is_pal_x = False
                    break
            for k in range(length) :
                if table[m][j+k] != table[m][length+j-1-k] :
                    is_pal_y = False
                    break
            if is_pal_x :
                cnt+=1
            if is_pal_y :
                cnt+=1
    print(f"#{i} {cnt}")