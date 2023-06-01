from persona import Persona

class Trabajador(Persona):
    def __init__(self, nombre, apellido, dni, puesto_trabajo, sueldo):
        super().__init__(nombre, apellido, dni)
        self.puesto_trabajo = puesto_trabajo
        self.sueldo = sueldo

    def __str__(self):
        return f"{super().__str__()} - Puesto: {self.puesto_trabajo}, Sueldo: {self.sueldo}"