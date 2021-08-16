cost = float(input())
lawns = int(input())
area = 0

for i in range(lawns):
    l, w = map(float, input().split())
    area += (l * w)

print(float(cost * area))