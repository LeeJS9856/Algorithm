def solution(numLog):
    before = 0
    word_list = [('w',1), ('s',-1), ('d',10), ('a', -10)]
    answer = ''
    for now in numLog :
        word = now - before
        for i in word_list:
            if word == i[1] :
                answer += i[0]
                break
        before = now
    return answer