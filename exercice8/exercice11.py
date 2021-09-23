import random


class exercice11:

    def __init__(self):
        pass

    def calcul(self,x):
        liste = ''
        letters = ["a","t","g","c"]
        for i in range(x):
            liste +=(random.choice(letters))
        #print(liste)
        return liste

    def proportion(self,a, s):
        return 100 * a.count(s) / len(a)
    
test = exercice11()
c = test.calcul(100)
s = test.calcul(2)
p = test.proportion(c,s)
print("chaine : " ,c)
print("séquence : ", s)
print("Il y a " , p , "% de ", '"',s,'" dans votre chaine.')
