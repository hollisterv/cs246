import time

fileName = input("please enter a file name: ")

#adding in snippets of time because i feel that it makes the program run at a more human eye pace.
time.sleep(0.5)
answer = input("type r to read the file | type a to add new text | type x to make a new file: ")

#simply reading what is on the file
if answer == "r":
    f = open(fileName, "r")
    print(f.read())
    f.close()

#writing new things to the file
elif answer == "a":
    f = open(fileName, "a")
    time.sleep(0.5)
    print("Add to your file: ")
    f.write(input())
    f.close
    time.sleep(0.5)
    print("Updated file: ")

    #opening again to read new content
    f = open(fileName, "r")
    print(f.read())

#this section is meant to write new files to the program that the program will be
#able to access later.
else: 
    time.sleep(0.5)
    newFile = input("Enter a new file name: ")
    f = open(newFile, "x")
    time.sleep(0.5)
    f.write(input())
    f.close

    #adding nested if statement to see if user wants to review what was written.
    time.sleep(0.5)
    readBack = input("type y if you want to review what you wrote | type n to finish").lower()
    if readBack == 'y':
        time.sleep(0.5)
        print("Here is what you wrote in the new file: ")
        f = open(newFile, "r")
        print(f.read())

        #closes file and lets the user know that writing is complete.
    else:
        f.close
        print("Closing file...")
