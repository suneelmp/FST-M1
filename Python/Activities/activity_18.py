import pandas

dataFrame = pandas.read_csv("sample.csv")
print("Full Data: ")
print(dataFrame)

print("**********************")
print("Usernames")
print(dataFrame.Usernames)

print("*****************")
print("Username: ", dataFrame["Usernames"][1], " | ", "Password: ", dataFrame["Passwords"][1])

print("*************************")
print(dataFrame.sort_values("Usernames"))

print("**********************")
print(dataFrame.sort_values("Passwords", ascending=False))