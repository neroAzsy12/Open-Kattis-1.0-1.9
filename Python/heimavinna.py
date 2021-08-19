problems = input().split(';')
count = 0;

for problem in problems:
    p_range = problem.split('-')

    if len(p_range) == 1:
        count += 1
    else:
        tmp = int(p_range[1]) - int(p_range[0])
        count += (tmp + 1)

print(count)