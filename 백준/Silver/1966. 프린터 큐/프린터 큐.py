from collections import deque

t = int(input())
for i in range(t) :
    n,m = list(map(int, input().split(' ')))
    imp_list = list(map(int, input().split(' ')))
    sorted_list = sorted(imp_list, reverse=True)
    imp_que = deque(imp_list)
    print_cnt = 0
    while(True) :
        tmp_print = imp_que.popleft()
        if sorted_list[print_cnt] == tmp_print :
            print_cnt += 1
            if m==0 :
                break
            m-=1
        else :
            imp_que.append(tmp_print)
            m = len(imp_que)-1 if m==0 else m-1
    print(print_cnt)