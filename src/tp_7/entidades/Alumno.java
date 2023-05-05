package tp_7.entidades;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import javax.swing.JOptionPane;



/**
 *
 * @author julie
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private Set<Materia> materias;
  
    
    public Alumno(int legajo,String apellido,String nombre){
        this.legajo=legajo;
        this.apellido=apellido;
        this.nombre=nombre;
        materias=new LinkedHashSet();
    }
    
    public int getLegajo(){
        return legajo;
    }
    public void setLegajo(int legajo){
        this.legajo=legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /*agregarMateria que permite inscribir al Alumno en 
una materia determinada (implementar de manera tal que no deje inscribir un 
    alumno en dos 
materias iguales.) y*/
    public void agregarMateria(Materia m){
       if(! materias.add(m))
           JOptionPane.showMessageDialog(null,"El alumno ya se encuentra inscripto en "+m.getNombre());
       else JOptionPane.showMessageDialog(null,"Alumno insripto exitosamente");
    }
    public int cantidadMaterias(){
        
        return materias.size();
    }

    @Override
    public int hashCode() {
      
        return Objects.hash(legajo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
    
}
