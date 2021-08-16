# n = num of eye designs
# t = num of nose designs
# m = num of mouth designs
n, t, m = map(int, input().split())
print(int(n * t * m))   # print the num of different designs that can be made