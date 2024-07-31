import pandas

data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataFrame = pandas.DataFrame(data)
print(dataFrame)

writer = pandas.ExcelWriter('sample.xlsx')
dataFrame.to_excel(writer, 'Sheet1', index = False)
writer.save() 