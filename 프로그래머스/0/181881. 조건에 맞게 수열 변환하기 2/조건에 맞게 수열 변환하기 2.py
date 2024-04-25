def solution(arr):
    count = 0
    while(True):
        if_change = False
        for num, i in enumerate(arr) :
            if i >= 50 and i % 2 == 0 :
                arr[num] = i/2
                if_change = True
            elif i < 50 and i % 2 == 1 :
                arr[num] = i * 2 + 1
                if_change = True
        if if_change == False :
            break
        count += 1
    return count
        