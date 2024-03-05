def solution(myString, pat):
    upperString = myString.upper()
    upperPat = pat.upper()
    
    if upperPat in upperString :
        return 1
    else:
        return 0