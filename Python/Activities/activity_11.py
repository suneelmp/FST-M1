fruit_shop = {
    'apple' : 100,
    'banana' :20,
    'cherry' :10,
    'orange' : 35
    }

check_fruit = input("Enter the fruit to check availability : ")
if check_fruit in fruit_shop :
    print('fruit is available')
else :
    print('fruit is not available')
