package ch02.diagramaclase.asociacion_ternaria;

import java.util.ArrayList;
import java.util.List;

public class Entrada {
    // 1 entrada puede no estar presente o estar presente en muchos menus
    // Ningun menu o muchos menus pueden contener una entrada
    List<Menu> menu = new ArrayList<>();
}
