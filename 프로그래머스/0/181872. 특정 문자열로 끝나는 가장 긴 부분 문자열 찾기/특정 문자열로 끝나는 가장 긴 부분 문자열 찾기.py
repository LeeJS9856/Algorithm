def solution(myString, pat):
    find_index = myString[::-1].find(pat[::-1])
    return myString[:len(myString)-find_index]
                                           