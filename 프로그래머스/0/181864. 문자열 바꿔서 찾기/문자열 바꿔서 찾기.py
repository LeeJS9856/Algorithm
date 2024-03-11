def solution(myString, pat):
    answer = myString.replace('A', '0').replace('B','A').replace('0','B')
    return 1 if pat in answer else 0