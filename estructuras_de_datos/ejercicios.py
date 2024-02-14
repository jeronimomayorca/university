# 1. Contar la cantidad de dígitos de un número entero positivo N.
def contar_digitos(num):

    digitos = 0

    if num < 10:
        return 1
    else:
        return contarDigitos(num // 10) + 1

# print(contar_digitos(12345))


# 2. Dado un número entero positivo N y un dígito T, contar la cantidad de veces que aparece el dígito T en el número N.
def contar_digitos_T(N, T):
    # Caso base: si N es 0, no hay dígitos que contar
    if N == 0:
        return 0
    else:
        ultimo_digito = N % 10  # obtener el último dígito de N
        # Llamar recursivamente con N reducido, quitando el último dígito
        return (ultimo_digito == T) + contar_digitos_T(N // 10, T)

# print(contar_digitos_T(12345, 5))


# 3. Generar un número entero positivo M a partir de los dígitos en orden inverso de otro número entero positivo N dado.
def invertir_numero(N, M=0):
    if N == 0:
        return M
    else:
        # Paso recursivo: desplazar M y añadir el último dígito de N
        return invertir_numero(N // 10, M * 10 + N % 10)

# print(invertir_numero(12345))


# 4. Contar la cantidad de dígitos pares de un número entero positivo N.
def contar_digitos_pares(N):
    # Caso base: si N es 0, no hay más dígitos que contar
    if N == 0:
        return 0
    else:
        # Determinar si el último dígito es par
        es_par = (N % 10) % 2 == 0
        # Llamar recursivamente con N reducido, quitando el último dígito
        return es_par + contar_digitos_pares(N // 10)

# print(contar_digitos_pares(123456))
