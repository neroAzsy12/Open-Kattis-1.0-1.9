n, k = map(int, input().split())    # n = the total num of judges, k = the num of judges that have rated already
sum = 0                 # the sum for the ratings of the k judges

for i in range(k):      # the k judges will provide their ratings for the problem
    sum += int(input()) # the next ith lines will contain a number between -3 and 3

min = ((sum + ((n - k) * -3)) / n) # the min overall rating the problem can achieve for the judges that have not rated yet
max = ((sum + ((n - k) * 3)) / n)  # the max overall rating the problem can achieve for the judges that have not rated yet

print(min, max)