soma_notas_alunos_impares = float(0.0)
soma_notas_alunos_pares = float(0.0)

print("VOCÊ ESTÁ DIGITANDO AS NOTAS DOS ALUNOS ÍMPARES")
for aluno in range (1, 51, 1):
    if aluno % 2 != 0:
        nota_aluno_impar = float(input("POR FAVOR, INSIRA A NOTA DO ALUNO DE NÚMERO {}: ".format(aluno)))
        soma_notas_alunos_impares += nota_aluno_impar
        media_notas_alunos_impares = soma_notas_alunos_impares/25

print("\nVOCÊ ESTÁ DIGITANDO AS NOTAS DOS ALUNOS PARES")
for aluno in range (1, 51, 1):
    if aluno % 2 == 0:
        nota_aluno_par = float(input("POR FAVOR, INSIRA A NOTA DO ALUNO DE NÚMERO {}: ".format(aluno)))
        soma_notas_alunos_pares += nota_aluno_par
        media_notas_alunos_pares = soma_notas_alunos_pares/25

print("\nMÉDIA DOS ALUNOS ÍMPARES: {}".format(media_notas_alunos_impares))
print("MÉDIA DOS ALUNOS PARES: {}".format(media_notas_alunos_pares))

if media_notas_alunos_pares > media_notas_alunos_impares:
    print("A MÉDIA DOS ALUNOS PARES FOI MAIOR")
else:
    print("A MÉDIA DOS ALUNOS ÍMPARES FOI MAIOR")

