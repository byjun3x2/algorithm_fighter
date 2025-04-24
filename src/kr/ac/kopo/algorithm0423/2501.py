M, N = map(int, input().split())
arr = []
for i in range(1, M+1):
    if M % i == 0:
        arr.append(i)
arr.sort()

if N > len(arr):
    print(0)
else:
    print(arr[N-1])
