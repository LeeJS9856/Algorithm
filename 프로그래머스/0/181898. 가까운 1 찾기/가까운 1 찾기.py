def solution(arr, idx):
    answer = ''.join(map(str, arr))
    return answer.find('1', idx)