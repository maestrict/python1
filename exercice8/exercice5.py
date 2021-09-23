class exercice5:
    def __init__(self):
        pass

    def calcul(self):
        nbr = 0
        x = int(input("donnez nombre"))

        while x%2 ==0 :
            x = x/2
            nbr += 1
            print(x)
        print(nbr)




test = exercice5()
test.calcul()