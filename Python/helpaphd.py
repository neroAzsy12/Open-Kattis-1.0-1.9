cases = int(input())

for i in range(cases):
    problem = input()

    if problem == 'P=NP':
        print('skipped')
    else:
        nums = problem.split("+")
        print(int(nums[0]) + int(nums[1]))