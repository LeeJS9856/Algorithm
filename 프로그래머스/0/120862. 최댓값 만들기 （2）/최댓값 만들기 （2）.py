def solution(numbers):
    numbers.sort()
    max_1 = numbers[0]*numbers[1]
    max_2 = numbers[-1]*numbers[-2]
    return max_1 if max_1 > max_2 else max_2