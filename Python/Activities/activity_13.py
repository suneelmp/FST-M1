def find_sum(numbers):
    sum = 0
    for num in numbers :
        sum = sum + num
    return sum

numlist = [1,2,3,4,5]
total_sum = find_sum(numlist)
print("Total sum is :" + str(total_sum))

