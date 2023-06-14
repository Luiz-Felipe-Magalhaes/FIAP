minutos = int(input("Digite os minutos atuais da máquina: "))

fatorial = 1
for x in range(1, minutos+1):
    fatorial *= x

senha = "LIBERDADE" + str(fatorial)
print("A senha de desbloqueio é:", senha)