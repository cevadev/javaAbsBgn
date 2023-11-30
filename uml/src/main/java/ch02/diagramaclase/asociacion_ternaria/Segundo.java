package ch02.diagramaclase.asociacion_ternaria;

import java.util.ArrayList;
import java.util.List;

public class Segundo {
    // 1 segundo puede no estar o puede estar en muchos menus
    // Ningun menu o muchos menus pueden contener un segundo
    List<Menu> menu = new ArrayList<>();
}
