def solution(price, money, count):
    answer = sum([i for i in range(1, count+1)]) * price - money
    return answer if answer > 0 else 0