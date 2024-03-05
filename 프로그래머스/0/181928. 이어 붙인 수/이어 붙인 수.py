def solution(num_list):
    sum_list = ['',''] #홀수, 짝수
    for i in num_list:
        if i % 2 == 1:
            sum_list[0] += str(i)
        else:
            sum_list[1] += str(i)
    return int(sum_list[0]) + int(sum_list[1])