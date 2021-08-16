import math

n = int(input())    # n = the num of input vals
total = 0           # to keep track of the sum

for i in range(n):
    p = input()     # p, the last digit is the exponent, while the rest is the acutal num
    total += math.pow(int(p[:-1]), int(p[-1]))

print(int(total))