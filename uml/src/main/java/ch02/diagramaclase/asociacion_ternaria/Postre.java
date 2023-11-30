package ch02.diagramaclase.asociacion_ternaria;

import java.util.ArrayList;
import java.util.List;

public class Postre {
    // 1 postre puede no estar o estar presente en muchos menu
    // ningun menu o muchos menu pueden contener 1 postre
    List<Menu> menu = new ArrayList<>();
}
