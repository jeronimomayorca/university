Clase: InstalacionDeportiva
    Atributos:
        - número: Integer
        - descripción: String
        - ancho: Double
        - largo: Double
    Métodos:
        + verificarDisponibilidad(fecha: Date, horaInicio: Time, horaFin: Time): Boolean

Clase: CanchaTenis (hereda de InstalacionDeportiva)
    Atributos:
        - tipoSuperficie: Enum (LADRILLO, CÉSPED)

Clase: Piscina (hereda de InstalacionDeportiva)
    Atributos:
        - esOlimpica: Boolean

Clase: CanchaMultiproposito (hereda de InstalacionDeportiva)
    Atributos:
        - tieneGraderias: Boolean

Clase: Socio
    Atributos:
        - cédula: String
        - nombre: String
        - dirección: String
        - teléfono: String
    Métodos:
        + registrarAlquiler(instalacion: InstalacionDeportiva, fecha: Date, horaInicio: Time, horaFin: Time): void

Clase: Alquiler
    Atributos:
        - socio: Socio
        - instalacion: InstalacionDeportiva
        - fecha: Date
        - horaInicio: Time
        - horaFin: Time
    Métodos:
        + calcularCosto(): Double
