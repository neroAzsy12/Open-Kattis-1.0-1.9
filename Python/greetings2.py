from sys import stdin
greet = stdin.readline()

num = greet.count('e') * 2

# outputs greet by with 'e' appearing twice as much
print('h' + (num * 'e') + 'y')