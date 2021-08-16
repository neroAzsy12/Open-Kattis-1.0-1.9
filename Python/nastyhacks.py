n = int(input())    # num of test cases

for i in range(n):
    # r = the expected revenue if you do not advertise
    # e = the expected revenue if you not advertise
    # c = the cost of advertising
    r, e, c = map(int, input().split())

    if e - c > r:           
        print('advertise')
    elif e - c == r:
        print('does not matter')
    elif e - c < r:
        print('do not advertise')