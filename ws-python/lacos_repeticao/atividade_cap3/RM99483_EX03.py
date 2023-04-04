#Software onde um professor preenche as notas dos seus 50 alunos separados em duas turmas, alunos impares e pares.
# Obtendo a media de cada turma e tambem qual delas teve a maior media.

#Criação e entrada das varias para soma das notas de cada turma
soma_notas_alunos_impares = float(0.0)
soma_notas_alunos_pares = float(0.0)

#Laços de repetição para que o usuario insira as notas individuais de cada aluno, separando por turma impar e par.
print("VOCÊ ESTÁ DIGITANDO AS NOTAS DOS ALUNOS ÍMPARES")
for aluno in range (1, 51, 2):
    nota_aluno_impar = float(input("POR FAVOR, INSIRA A NOTA DO ALUNO DE NÚMERO {}: ".format(aluno)))
    #Soma de cada nota, incrementando na variavel soma_notas_alunos_impares, e calculo da media na variavel media_notas_alunos_impares.
    soma_notas_alunos_impares += nota_aluno_impar
    media_notas_alunos_impares = soma_notas_alunos_impares/25

print("\nVOCÊ ESTÁ DIGITANDO AS NOTAS DOS ALUNOS PARES")
for aluno in range (2, 51, 2):
    nota_aluno_par = float(input("POR FAVOR, INSIRA A NOTA DO ALUNO DE NÚMERO {}: ".format(aluno)))
    soma_notas_alunos_pares += nota_aluno_par
    media_notas_alunos_pares = soma_notas_alunos_pares/25

#Resultado final, mostrando a media de cada turma, e desvio condicional mostrando qual das turmas teve a maior media
print("\nMÉDIA DOS ALUNOS ÍMPARES: {}".format(media_notas_alunos_impares))
print("MÉDIA DOS ALUNOS PARES: {}".format(media_notas_alunos_pares))

if media_notas_alunos_pares > media_notas_alunos_impares:
    print("A MÉDIA DOS ALUNOS PARES FOI MAIOR")
else:
    print("A MÉDIA DOS ALUNOS ÍMPARES FOI MAIOR")

