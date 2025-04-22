
N, M = map(int, input().split())
data = list(map(int, input().split()))  # 전체 수열

cnt = 0
interval_sum = 0
end = 0

for start in range(N):

    while interval_sum < M and end < N:
        interval_sum += data[end]
        end += 1

    if interval_sum == M:
        cnt += 1
    interval_sum -= data[start]

print(cnt)