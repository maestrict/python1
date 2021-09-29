import random

class exercice15:

    def __init__(self):
        pass

    def giveNumber(self):
        x = random.randint(0,3999)
        return x

    def romain(self,n):
        nbrRomain = []
        listenbrRomain = {"M" : 1000, "D":500, "c":100, "xc":90,"lxxx": 80,"lxx": 70,"lx":60,"l":50, "xl":40,"x":10,"ix":9,"viii":8,"vii":7,"vi":6,"v":5,"iv":4,"I":1}
        x = n
        while x >= 0:
            if x - listenbrRomain["M"] >=0:
                nbrRomain.append("M")
                y = listenbrRomain["M"]
            elif x - listenbrRomain["D"] >= 0:
                nbrRomain.append("D")
                y = listenbrRomain["D"]
            elif x - listenbrRomain["c"] >= 0:
                nbrRomain.append("c")
                y = listenbrRomain["c"]
            elif x - listenbrRomain["xc"] >= 0:
                nbrRomain.append("xc")
                y = listenbrRomain["xc"]
            elif x - listenbrRomain["lxxx"] >= 0:
                nbrRomain.append("lxxx")
                y = listenbrRomain["lxxx"]
            elif x - listenbrRomain["lxx"] >= 0:
                nbrRomain.append("lxx")
                y = listenbrRomain["lxx"]
            elif x - listenbrRomain["lx"] >= 0:
                nbrRomain.append("lx")
                y = listenbrRomain["lx"]
            elif x - listenbrRomain["l"] >= 0:
                nbrRomain.append("l")
                y = listenbrRomain["l"]
            elif x - listenbrRomain["xl"] >= 0:
                nbrRomain.append("xl")
                y = listenbrRomain["xl"]
            elif x - listenbrRomain["x"] >= 0:
                nbrRomain.append("x")
                y = listenbrRomain["x"]
            elif x - listenbrRomain["ix"] >= 0:
                nbrRomain.append("ix")
                y = listenbrRomain["ix"]
            elif x - listenbrRomain["viii"] >= 0:
                nbrRomain.append("viii")
                y = listenbrRomain["viii"]
            elif x - listenbrRomain["vii"] >= 0:
                nbrRomain.append("vii")
                y = listenbrRomain["vii"]
            elif x - listenbrRomain["vi"] >= 0:
                nbrRomain.append("vi")
                y = listenbrRomain["vi"]
            elif x - listenbrRomain["v"] >= 0:
                nbrRomain.append("v")
                y = listenbrRomain["v"]
            elif x - listenbrRomain["iv"] >= 0:
                nbrRomain.append("iv")
                y = listenbrRomain["iv"]
            elif x - listenbrRomain["I"] >= 0:
                nbrRomain.append("I")
                y = listenbrRomain["I"]
            x = x - y


        return nbrRomain

test = exercice15()
x  = test.giveNumber()
print(x)
c = test.romain(x)
string = "".join([str(item) for item in c])
print(string)
