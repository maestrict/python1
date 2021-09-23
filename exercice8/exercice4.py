class exercice4:
    def __init__(self):
        pass

    def calcul(self):

        x = int(input("donnez nombre"))

        if x%2 ==0 :
            print("PAIR")
        else:
            print("IMPAIR")

test = exercice4()
test.calcul()