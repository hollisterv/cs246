#shopping store calculator
print("Welcome to the general store!")
items = int(input("Please enter the amount of items you are purchasing: "))
subTotal = 0
for x in range(items):
    price = int(input("please enter price of item: "))

    subTotal = price + subTotal

print("Subtotal: "+str(subTotal))

#adding sales tax... 8%
total = float(subTotal * 1.08)
print("Total: "+str(total))