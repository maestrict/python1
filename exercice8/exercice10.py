class exercice10:


    def __init__(self):
        pass


    def tchacatchac2(self,x):
        h = 9

        # x = int(input("Quelle vitesse? "))

        tempsmin = (60/x)*150
        print(x)
        while tempsmin>=60:
            h+=1
            tempsmin -=60
            

        print(h , ":" , int(tempsmin))

    def tchacatchac(self):
        x =100
        while  x < 300:
            test.tchacatchac2(x)
            x+=10
        test.tchacatchac2(x)



test = exercice10()
test.tchacatchac()


