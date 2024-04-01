def solution(absolutes, signs):
    answer = 0
    for num, i in zip(absolutes, signs) :
        if i:
            answer += num
        else :
            answer -= num
    return answer