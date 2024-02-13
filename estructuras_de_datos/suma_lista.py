def sumar_numeros(lista):
    if not lista:
        return 0
    else:
        primer_elemento = lista[0]
        if isinstance(primer_elemento, list):
            return sumar_numeros(primer_elemento) + sumar_numeros(lista[1:])
        else:
            return primer_elemento + sumar_numeros(lista[1:])


lista_de_numeros = [1, 2, [3, 4], 5, [6, [7, 8]]]
resultado = sumar_numeros(lista_de_numeros)
print(f"La suma de los números en la lista es: {resultado}")
