N = int(input())
M = int(input())

answer = []
arrN = []
arrM = []

for i in range(N):
    for j in range(M):
        arrN.append(int(input()))
answer.append([arrN])
print(answer)