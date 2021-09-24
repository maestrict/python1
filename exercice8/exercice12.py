
import random

class exercice12:

    def __init__(self):
        pass
    def generate(self, a, b):
        nbr = []
        for i in range(10):
            nbr.append(random.randint(a,b))
        print(nbr)
        print(nbr.index(min(nbr)))
        idx1 = nbr.index(min(nbr))
        nbr[idx1],nbr[0] = nbr[0], nbr[idx1]
        print(nbr)

test = exercice12()
test.generate(4,12)
