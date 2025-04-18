print('숫자를 입력해주세요')
num = int(input())
count = 0

while num >= 0:
    if num % 5 == 0:
        count += int(num // 5)
        print(count)
        break

    num -= 3
    count += 1

else:
    print(-1)


# N5 = N//5
# N3 = (N - (N5 * 5))//3
#
# print(N5 + N3)
#
# # if N5 == 0 and N3 == 0: -1