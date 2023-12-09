import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    public static void main(String[] args) {
        int opcionIndice = 0;
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        while (opcionIndice!=5) {

            Object opcion = JOptionPane.showInputDialog(null, "Seleccione un Opción", "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                if (opcionIndice == 1) {
                    JOptionPane.showMessageDialog(null, "Usuario actualizado con éxito!");
                } else if (opcionIndice == 2) {
                    JOptionPane.showMessageDialog(null, "Usuario eliminado con exito!");
                } else if (opcionIndice == 3) {
                    JOptionPane.showMessageDialog(null, "Usuario agregado con exito!");
                } else if (opcionIndice == 4){
                    JOptionPane.showMessageDialog(null, "Usuario listado con exito!");
                } else {
                }
            }
        }
            JOptionPane.showMessageDialog(null,"Haz salido con exito!");

    }
}
