n,m = map(int, input().split())

if (m % n == 0):
    print('factor')
elif (m % n == 1):
    print('multiple')
else:
    print('neither')