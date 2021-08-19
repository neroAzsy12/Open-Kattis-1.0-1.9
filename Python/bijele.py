piece_set = [1, 1, 2, 2, 2, 8]                      # expected num of pieces per set
pieces = [int(piece) for piece in input().split()]  # given num of pieces of a set

for expected, given in zip(piece_set, pieces):
    print(expected - given, end = ' ')              # print whether pieces should be removed or added
print()