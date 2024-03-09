n = int(input())
num_list = list(map(int, input().split(' ')))
oper_list  = list(map(int, input().split(' ')))
answer_list = []
def calculate(index=0, answer = num_list[0]) :
    original = answer
    if index == len(num_list)-1 :
        answer_list.append(answer)
        return
    for i in range(4) : #플, 마, 곱, 나 순환
        if oper_list[i] > 0 : #해당 연산자가 리스트에 존재하면 계산
            if i == 0 :
                answer += num_list[index + 1]
            elif i == 1:
                answer -= num_list[index + 1]
            elif i == 2:
                answer *= num_list[index + 1]
            else :
                if answer * num_list[index + 1] < 0 :#둘중에 하나가 음수면
                    answer = (answer*-1 // num_list[index + 1])*-1
                else :
                    answer = answer // num_list[index + 1]
            oper_list[i] -= 1
            calculate(index+1, answer)
            oper_list[i] += 1
            answer = original
calculate()
print(max(answer_list))
print(min(answer_list))