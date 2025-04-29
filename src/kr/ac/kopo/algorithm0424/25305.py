import sys
N, M = map(int, input().split())
arr = []
for i in range(N):
    arr.append(int(input()))
arr.sort()
print(arr[-M])