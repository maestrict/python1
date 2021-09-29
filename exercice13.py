class exercice13:

    def __init__(self):
        pass

    def minmaxmoy(self):
        nbr= [10, 18, 14, 20, 12, 16]
        x=0
        print(min(nbr))
        print(max(nbr))
        w = len(nbr)
        print(w)
        for i in nbr:
            x += i
            #print(x)
        print(x)
        y = x/w
        print(y)

test= exercice13()
test.minmaxmoy()