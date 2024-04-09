def solution(arr, divisor):
    answer_list = [i for i in arr if i % divisor == 0]
    return sorted(answer_list) if len(answer_list) != 0 else [-1]
            
