n = int(input())    # the number of stones, 1 ≤ N ≤ 10,000,000

if (n % 2) != 0:    # if there are odd num of stones, Alice wins
    print("Alice")
else:               # if there are even num of stones, Bob wins
    print("Bob")