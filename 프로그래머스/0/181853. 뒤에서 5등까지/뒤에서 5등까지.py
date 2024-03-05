def solution(num_list):
    sorted_list = sorted(num_list)
    answer = []
    for i in range(5):
        answer.append(sorted_list[i])
    return answer