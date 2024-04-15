def solution(myStr):
    for i in myStr:
        if i in "abc" :
            myStr = myStr.replace(i, ' ')
    return myStr.split() if myStr.split() else ["EMPTY"]