
class exercice3:

    def __init__(self):
        pass
    def calcul(self):
        somme, nbrtotal, nbrplusgrandque = 0,0,0
        x = int(input("x (0pour terminer)"))

        while x > 0:
            somme +=  x
            nbrtotal += 1
            if x > 100:
                nbrplusgrandque += 1
            x = int(input("x (0pour terminer)"))
        print("somme =" , somme)
        print(nbrtotal, " valeurs en tout  " , nbrplusgrandque, " valeurs plus grande que 100")

test = exercice3()
test.calcul()