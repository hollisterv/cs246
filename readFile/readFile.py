fileName = input("please enter a file name: ")
answer = input("type r to read the file and type a to add new text: ")

if answer == "r":
    f = open(fileName, "r")
    print(f.read())
    f.close()
else:
    f = open(fileName, "a")
    print("Add to your grocery list: ")
    f.write(input())
    f.close
    print("Here is your updated grocery list: ")
    #opening again to read new content
    f = open(fileName, "r")
    print(f.read())
