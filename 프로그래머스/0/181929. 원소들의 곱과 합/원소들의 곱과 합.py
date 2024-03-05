def solution(num_list):
    sum = 0
    mul = 1
    for i in num_list:
        sum += i
        mul *= i
    if mul < sum**2:
        return 1
    else :
        return 0