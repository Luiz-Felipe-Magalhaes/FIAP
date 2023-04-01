gols_time1 = int(input("Numero de Gols do Time1: "))
gols_time2 = int(input("Numero de Gols do Time2: "))

if gols_time1 > gols_time2:
    print("Vitória do Time1")
elif gols_time1 < gols_time2:
    print("Vitória do Time2")
else:
    print("Empate")