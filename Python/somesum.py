n = int(input())   # n = consecutive positive int, 1 ≤ n ≤ 10

if n % 2 == 1:
    # consecutive sum of numbers that are not divisible by 2 are either
    print('Either')
elif n % 4 == 0:
    # consecutive sum of numbers that are divisible by 4 are even 
    print('Even')
else:
    print('Odd')