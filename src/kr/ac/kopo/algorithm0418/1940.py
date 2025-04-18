N = int(input())
M = int(input())
C = 0;

for i in range(N):
    for j in range(N):
        if i + j == M: C += 1

print(C);

