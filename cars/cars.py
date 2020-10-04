import time

class Cars:
    def __init__(self, make, model, year, color):
        self.make = make
        self.model = model
        self.year = year
        self.color = color

honda = Cars("Honda", "Civic", 2020, "grey")
toyota = Cars("Toyota", "Camery", 2020, "silver")
audi = Cars("Audi", "A4", 2004, "silver")
lucid = Cars("Lucid", "Air", 2020, "midnight blue")

#guessing the model of the car
guess = ' '

#puts it through a while loop to determine if they were right
while guess != 'honda': 
    guess = input("Try and guess the make of my car: ").lower() #solving for possible case issues

print("Your guessed right! my car is a "+honda.make+" "+honda.model)

#lets continue playing the game. 
#adding additional delay times to make the guessing game seem not so quick
time.sleep(0.5)
print("Now lets have some fun with these next questions")

#guessing the most purchased vehicle in the US
guess2 = ' '

while guess2 != 'toyota':
    time.sleep(0.2)
    guess2 = input("What was the most purchased car in the US for the past 20 years? ").lower()
    
print("You're right! That car is the "+toyota.make+" "+toyota.model)

time.sleep(0.5)
print("last question, are you ready?")

guess3 = ' '

#my dad's place of work...
while guess3 != 'lucid':
    time.sleep(0.2)
    guess3 = input("What is the 5th most ranked electric motor company? ").lower()

print("You're right! "+lucid.make+" "+lucid.model+". Go check them out!")