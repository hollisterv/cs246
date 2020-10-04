import time

#shopping store calculator
print("Welcome to the general store!")
print("|------------------------------|")
items = int(input("Please enter the amount of items you are purchasing: "))
print("-|------------------------------------------------|-")

#adding subtotal and empty list to record total price of items
#add the names of the grocery items
subTotal = 0
lst = []
for x in range(items):

    time.sleep(0.5)
    price = float(input("please enter price of item: "))

    #checking to see if user puts in a positive number or negative number
    if price < 1:
        print("Eror: please enter a non-negative number.")
        time.sleep(0.5)
        price = float(input("please enter price of item: "))

        #the for loop can continue as the user inputs the name of the item
    else:
        time.sleep(0.5)
        shopping = input("Enter the name of the item you are purchasing: ").lower()

#allows the user to add the groceries that they are purchasing.
#the list will be seen at the end. 
    lst.append(shopping)

#adds the price of the item into the subtotal
    subTotal = price + subTotal

time.sleep(0.5)
print("Subtotal: "+str(subTotal))
print("--------------------")

#adding sales tax... 8%
time.sleep(0.5)
total = float(subTotal * 1.08)

#rounding the total price in the case that a number divided has several decimal places.
priceTotal = str(round(total, 2))
print("Total: "+str(priceTotal))

#listing the total items purchased.
time.sleep(0.5)
print("Here is the list of items purchased")
print("-----------------------------------")
print(lst)