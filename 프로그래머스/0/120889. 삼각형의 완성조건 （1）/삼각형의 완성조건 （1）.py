def solution(sides):
    sorted_sides = sorted(sides)
    if sorted_sides[0] + sorted_sides[1] > sorted_sides[2] :
        return 1
    else :
        return 2