def solution(q, r, code):
    return ''.join([i for num, i in enumerate(code) if num%q==r])
        