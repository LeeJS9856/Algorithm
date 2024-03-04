def solution(array, height):
    count = 0
    for i in array :
        if i > height :
            count = count + 1
    return count