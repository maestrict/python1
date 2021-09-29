import random

class exercice14:

    def __init__(self):
        pass

    def giveRandom(self):

        nombreRandom = random.randint(0,10)
        print(nombreRandom)
        return nombreRandom
    def listRandom(self,n):

        nbr = []
        for i in range(n):
            c = random.randint(0,100)
            nbr.append(c)

        print(nbr)
        return nbr
    def ecart(self, n):
        x = max(n)
        y = min(n)
        z = x-y
        print(z)
        return z

    def moyenne(self,n):
        x=0
        w = len(n)
        for i in n:
            x+= i
        y = x/w
        print(y)
        return y


test = exercice14()
c = test.giveRandom()
w = test.listRandom(c)
z = test.ecart(w)
v = test.moyenne(w)