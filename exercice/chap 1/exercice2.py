import csv

liste = []
liste1 = []
nom = []
salaire = []
salairefinal = []
# Ecrivez le code ci-dessous. Utilisez le package csv !
with open('input.csv') as input_csv:
    reader = csv.DictReader(input_csv, delimiter=",")
    for ligne in reader:
        nom.append(ligne["nom"])
        salaire.append(ligne["heures_travaillees"])

        salaire1 = list(map(int, salaire))
    for i in salaire1:
        i = i * 15
        salairefinal += [i]
    liste = [nom]
    liste1 = [salairefinal]
print(liste)
print(liste1)
en_tete = ["Nom", "salaire"]
with open('output.csv', 'w') as csv_file:
    writer = csv.writer(csv_file, delimiter=',')
    writer.writerow(en_tete)
    for nom, salaire in zip(liste, liste1):
        writer.writerow([nom, salaire])