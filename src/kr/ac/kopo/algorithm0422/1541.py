Line = input()
arrA = Line.split('-')
start = int(arrA[0])


for i in range(len(arrA)):
    start += int(arrA[i])

print(start)