# n = the num of faces of dice 1
# m = the num of faces of dice 2
n, m = map(int, input().split())

if n == m:      # if both dice have the same num of faces, then it most likely to get (n + 1) as the sum
    print(n + 1)
else:
    start = min(n, m) + 1
    end = abs(n - m) + 1
    for i in range(start, start + end):
        print(i)