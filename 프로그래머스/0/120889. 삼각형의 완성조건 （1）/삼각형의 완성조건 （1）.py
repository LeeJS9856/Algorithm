def solution(sides):
    sorted_sides = sorted(sides)
    return 1 if sorted_sides[0] + sorted_sides[1] > sorted_sides[2] else 2