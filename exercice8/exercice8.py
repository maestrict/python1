class exercice8:



    def __init__(self):
        pass
    def calcul(self):
        toillette = 5 * 2
        semaine = 7
        nbmarche = int(input("Nombre de marche du phare?"))
        hauteurmarche = int(input("Hauteur en cm des marches?"))
        total = toillette * semaine * nbmarche * hauteurmarche
        print("Pour ", nbmarche, " marches de ", hauteurmarche, " cm", ", il parcourt ", total/100000, " km par semaine")

test = exercice8()
test.calcul()




