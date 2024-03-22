def solution(binomial):
    a, op, b = binomial.split(' ')
    op_list = '+-*'
    if op == op_list[0] :
        return int(a)+int(b)
    elif op==op_list[1] :
        return int(a)-int(b)
    else :
        return int(a)*int(b)