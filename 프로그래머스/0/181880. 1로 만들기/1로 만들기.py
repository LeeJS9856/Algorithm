def cal(num, cnt=0) :
        if num==1 :
            return cnt
        if num % 2 == 1 :
            num = (num-1) // 2
        else :
            num = num // 2
        return cal(num, cnt+1)
        
def solution(num_list):
    return sum([cal(i) for i in num_list])
        