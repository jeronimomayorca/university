def esta_elemento_vector(vec, elm):
    for i in range(len(vec)):
        if vec[i] == elm:
            return True
        return False


def esta_elemento_vector_v2(vec, elm):
    return elm in vec


def ordenar_vector(vec):
    for i in range(len(vec)):
        for j in range(1, len(vec)):
            if vec[i] < vec[j]:
                if vec[i] < vec[j]:
                    tmp = vec[i]
                    vec[i] = vec[j]
                    vec[j] = vec[tmp]
        return vec


def calcular_media(vec):
    media = 0
    for i in range(len(vec)):
        media += vec[i]
    return media / len(vec)


def sumar_matrices(mat1, mat2):
    for i in range(len(mat1)):
        for j in range(len(mat1)):
            print(mat1[i][j] + mat2[i][j])


def sumar_matrices(mat1, mat2):
    for i in range(len(mat1)):
        for j in range(len(mat1)):
            print(mat1[i][j] - mat2[i][j])


def multiplicar_escalar(mat, e):
    for i in range(len(mat)):
        for j in range(len(mat)):
            mat[i][j] *= e
