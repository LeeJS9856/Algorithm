L, C = map(int, input().split())
alpha = sorted(list(input().split(' ')))

def is_vowel(word) :
    vowel_list = ['a', 'e', 'i', 'o', 'u']
    if word in vowel_list :
        return True
    else :
        return False

def password(arr = [], conso = 2, vowel = 1) :
    if len(arr) == L : #탈출조건 : 암호가 L글자가 완성될때
        if conso <= 0 and vowel <= 0 : #자음과 모음 최소조건
            print("".join(map(str, arr)))
        return

    for i in alpha :
        if len(arr) != 0 and arr[-1] > i: #오름차순
            continue
        if i not in arr:
            if is_vowel(i) :
                arr.append(i)
                password(arr, conso, vowel-1)
                arr.pop()
            else :
                arr.append(i)
                password(arr, conso-1, vowel)
                arr.pop()


password()
