def solution(todo_list, finished):
    return list(i[0] for i in zip(todo_list, finished) if not i[1])
        