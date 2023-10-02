import datetime
from dataclasses import dataclass


@dataclass
class InstalacionDeportiva:
    numero: int
    descripcion: str
    ancho: float
    largo: float

    def verificar_disponbilidad(self, fecha: datetime, hora_inicio: datetime, hora_fin: datetime) -> bool:
        ...


@dataclass
class CanchaTennis:
    tipo_superficie: bool


@dataclass
class Piscina:
    es_olimpica: bool


@dataclass
class CanchaMultiproposito:
    tiene_graderias: bool


class Socio:
    nombre: str
    cedula: int
    direccion: str
    telefono: int

    def registrar_alquiler(self, instalacion: InstalacionDeportiva, fecha: datetime, hora_inicio: datetime,
                           hora_fin: datetime) -> None:
        ...


@dataclass
class Alquiler:
    socio: Socio
    instalacion = InstalacionDeportiva
    fecha: datetime
    hora_inicio: datetime
    hora_fin: datetime

    def calcular_costos(self) -> float:
        ...
