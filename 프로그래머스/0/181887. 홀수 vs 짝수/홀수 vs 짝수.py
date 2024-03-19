def solution(num_list):
    odd_sum = sum(num_list[0:len(num_list):2])
    even_sum = sum(num_list[1:len(num_list):2])
    return odd_sum if odd_sum > even_sum else even_sum