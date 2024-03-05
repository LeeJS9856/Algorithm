import math


def solution(price):
    if 100000 <= price < 300000:
        return math.floor(price*95/100)
    elif 300000 <= price < 500000:
        return math.floor(price*90/100)
    elif 500000 <= price:
        return math.floor(price*80/100)
    else :
        return price


