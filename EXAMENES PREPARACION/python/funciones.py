import pickle
from persona import Persona
from trabajador import Trabajador

def guardar_usuarios(usuarios):
    with open('usuarios.pkl', 'wb') as archivo:
        pickle.dump(usuarios, archivo)

def cargar_usuarios():
    try:
        with open('usuarios.pkl', 'rb') as archivo:
            return pickle.load(archivo)
    except FileNotFoundError:
        return []

def ver_usuarios(usuarios):
    if not usuarios:
        print("No hay usuarios registrados.")
    else:
        for usuario in usuarios:
            print(usuario)

def añadir_usuario(usuarios):
    nombre = input("Ingrese el nombre del usuario: ")
    apellido = input("Ingrese el apellido del usuario: ")
    dni = input("Ingrese el DNI del usuario: ")
    puesto_trabajo = input("Ingrese el puesto de trabajo del usuario: ")
    sueldo = float(input("Ingrese el sueldo del usuario: "))

    trabajador = Trabajador(nombre, apellido, dni, puesto_trabajo, sueldo)
    usuarios.append(trabajador)
    guardar_usuarios(usuarios)
    print("Usuario añadido exitosamente.")

def borrar_usuario(usuarios):
    dni = input("Ingrese el DNI del usuario a borrar: ")
    encontrado = False

    for usuario in usuarios:
        if isinstance(usuario, Trabajador) and usuario.dni == dni:
            usuarios.remove(usuario)
            encontrado = True
            break

    if encontrado:
        guardar_usuarios(usuarios)
        print("Usuario borrado exitosamente.")
    else:
        print("No se encontró ningún usuario con ese DNI.")

def editar_usuario(usuarios):
    dni = input("Ingrese el DNI del usuario a editar: ")
    encontrado = False

    for usuario in usuarios:
        if isinstance(usuario, Trabajador) and usuario.dni == dni:
            puesto_trabajo = input("Ingrese el nuevo puesto de trabajo: ")
            sueldo = float(input("Ingrese el nuevo sueldo: "))

            usuario.puesto_trabajo = puesto_trabajo
            usuario.sueldo = sueldo
            encontrado = True
            break

    if encontrado:
        guardar_usuarios(usuarios)
        print("Usuario editado exitosamente.")
    else:
        print("No se encontró ningún usuario con ese DNI.")

# Carga los usuarios existentes
usuarios = cargar_usuarios()

while True:
    print("\n-- Menú --")
    print("1. Ver usuarios")
    print("2. Añadir usuario")
    print("3. Borrar usuario")
    print("4. Editar usuario")
    print("5. Salir")

    opcion = input("Ingrese una opción: ")

    if opcion == "1":
        ver_usuarios(usuarios)
    elif opcion == "2":
        añadir_usuario(usuarios)
    elif opcion == "3":
        borrar_usuario(usuarios)
    elif opcion == "4":
        editar_usuario(usuarios)
    elif opcion == "5":
        break
    else:
        print("Opción inválida. Intente nuevamente.")