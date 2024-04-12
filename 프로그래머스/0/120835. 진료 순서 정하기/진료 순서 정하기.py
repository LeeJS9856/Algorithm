def solution(emergency):
    sorted_emergency = sorted(emergency, reverse = True)
    return [sorted_emergency.index(i)+1 for i in emergency]
        