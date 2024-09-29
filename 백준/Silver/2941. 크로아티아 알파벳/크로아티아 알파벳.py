import sys

x = sys.stdin.readline().strip()
alpha_count = len(x)
croAlpha = ['c=', 'c-','d-', 'lj', 'nj', 's='] #dz=와 z=는 중복이 있으므로 제외

count = 0
dz_count = x.count('dz=')
z_count = x.count('z=')

for i in croAlpha : 
    count += x.count(i) #우선 나머지 카운트

count += z_count - dz_count # z=의 개수
alpha_count -= count * 2 #dz=를 제외한 나머지 단어는 두글자이므로, 갯수 * 2 만큼 지워줌
alpha_count -= dz_count * 3 #dz=는 세글자이므로, 갯수*3만큼 지워줌
alpha_count += count + dz_count #alpha_count는 순수 알파벳만 남으므로, 크로아티아 알파벳의 개수를 더해준다.

print(alpha_count)

