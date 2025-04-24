M = int(input())

lst = []
for i in range(M):
    lst.append(input())

lst = list(set(lst))

new_lst = sorted(lst, key=lambda x: (len(x), x))
print(new_lst)

# but
# i
# wont
# hesitate
# no
# more
# no
# more
# it
# cannot
# wait
# im
# yours