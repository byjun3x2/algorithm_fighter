# a, b = map(int, input().split())
#
# # print(a, b)
#
# n0 = a  # 입력할 값의 개수
# n1 = b
# arrA = input().split()[0:n0]
# arrB = input().split()[0:n1]
# arrC = [*arrA,*arrB]
# lst = list(map(int, arrC))
# lst.sort()
# print(arrC)

n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
result = sorted(a + b)
print(' '.join(map(str, result)))
