def solution(num_list):
    sum = 0
    mul = 1
    for i in num_list:
        sum += i
        mul *= i
    return 1 if mul < sum**2 else 0