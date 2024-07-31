list1 = [2,4,7,11,16]
list2 = [3,9,12,18,19]
print(list1)
print(list2)
list3 = []
for i in list1:
    if(i % 2!=0):
        list3.append(i)

for j in list2:
    if(j % 2 ==0):
        list3.append(j)

print(list3)