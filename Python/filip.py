nums = input().split()
a = ''.join(reversed(nums[0]))  # reverse the first num
b = ''.join(reversed(nums[1]))  # reverse the second num
print(max(int(a), int(b)))      # print the max of the reversed nums