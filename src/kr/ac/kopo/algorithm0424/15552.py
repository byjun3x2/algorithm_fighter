import sys

N = int(sys.stdin.readline())
matrix = []
for r in range(N):
    matrix.append(list(map(int, sys.stdin.readline().split())))

for i in range(N):
    print(matrix[i][0] + matrix[i][1])