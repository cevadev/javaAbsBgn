package ch02.diagramaclase.asociacion_calificada;

import java.util.HashMap;
import java.util.Map;

public class Restaurante {
    // un restaurante puede pagar salarios a uno o muchos empleados
    private Map<Integer, Empleado> empleados = new HashMap<>();
}
