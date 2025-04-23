N = int(input())
arr = []
for i in range(N):
    arr.append(input())

for x in arr:
    print(x[0]+x[-1])