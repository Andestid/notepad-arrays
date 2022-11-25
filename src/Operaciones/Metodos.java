
package Operaciones;
import java.util.ArrayList;

public class Metodos {
    private ArrayList texto = new ArrayList ();
    String guarda="";
    private ArrayList nombre = new ArrayList();
    public void enviar(String v){
       guarda=v;
    }
    public String imprimir(){
        String v="";
        v=guarda;
       return v;
    }
    public void Guardar(){
        nombre.add(javax.swing.JOptionPane.showInputDialog("¿Que nombre desea ponerle?: "));
        texto.add(imprimir());
        javax.swing.JOptionPane.showMessageDialog(null, "Guardado");
    }

    public String abrir(){
        String g="";
        for(int i=0;i<nombre.size();i++){
            g=g+nombre.get(i)+"\n";
        }
        String a=javax.swing.JOptionPane.showInputDialog("¿Que archivo desea abrir?"+"\n"+g);
         for(int i=0;i<nombre.size();i++){
           if(a.equals(nombre.get(i))){
               return (String) texto.get(i);
           }
        }
         javax.swing.JOptionPane.showMessageDialog(null, "Ese texto no existe...");
       return null;
    }
    public void reestablecer(){
        String g=javax.swing.JOptionPane.showInputDialog("Quiere borrar todo (Y/N): ").toUpperCase();
        switch (g){
            case "Y":
                for(int i=0;i<nombre.size();i++){
                    nombre.clear();
                    texto.clear();
                }
                break;
            case "N":
                javax.swing.JOptionPane.showMessageDialog(null, "Bueno, ta bien");
                break;
            default:
                javax.swing.JOptionPane.showMessageDialog(null, "ERROR");              
        }
    }
}
