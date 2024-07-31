import pandas

data = {
    "Usernames" : ["admin", "Charles", "Deku"],
    "Passwords" : ["passowrd", "Charl13","AllMight"]
}

dataFrame = pandas.DataFrame(data)
print(dataFrame)

dataFrame.to_csv("sample.csv",index=False)