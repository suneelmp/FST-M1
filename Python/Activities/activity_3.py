user1 = input("Enter Player1 name :")
user2 = input("Enter Player2 name :")

user1_answer = input(user1 +" choose rock, paper or scissor : ")
user2_answer = input(user2 +" choose rock, paper or scissor : ")

if (user1_answer == user2_answer):
    print("Game is tie")
elif (user1_answer=='rock'):
    if user2_answer == 'scissor' :
        print("rock wins")
    else:
        print("Paper wins!")
elif user1_answer == 'scissors':
    if user2_answer == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif user1_answer == 'paper':
    if user2_answer == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")


