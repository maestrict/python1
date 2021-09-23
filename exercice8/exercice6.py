class exercioe6:
    def __init__(self):
        pass

    def calcul(self):
        nbr = []
        total = 0
        x = int(input("Entrez un entier stricetement positif "))

        while x < 0:
            x = int(input("Entrez un entier stricetement positif "))

        for i in range(x):
            if i!=0 and i!= 1 and x%i :
                pass
            elif  i!=0 :
                nbr.append(i)
                total += 1
        if total == 0:
            print("Diviseurs propres sans répétition de ", x, " : " , " aucun ! Il est premier")
        else:
            nbr.append(x)
            total +=1
            print("Diviseurs propres sans répétition de ", x , " : " ,nbr, " (soit ", total, " diviseurs propres" )

test = exercioe6()
test.calcul()