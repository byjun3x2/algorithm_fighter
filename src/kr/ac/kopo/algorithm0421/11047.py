N, K = map(int, input().split())

valueArr = []
valueCnt = []
for i in range(N):
    valueArr.append(int(input()))
valueArr.sort()
print(valueArr)
for j in range(N):
    valueCnt.append(int((K / valueArr[j])))
# valueCnt.sort()
print(valueCnt)





