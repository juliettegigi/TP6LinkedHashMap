/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author julie
 */
public class Validaciones {
    
    String []errores;
    public Validaciones(int length){ /*length tiene q ser la cantidad de textfield*/
        errores=new String[length];
        initErrores();
    }

    public String getError(int i) {
        return errores[i];
    }
    
    
        public void initErrores(){
        for(int i=0;i<errores.length;i++){
            errores[i]="e";
        }
    }
    
        public boolean rango(String numero,int i,int desde,int hasta){
            if(Integer.parseInt(numero)<desde || Integer.parseInt(numero)>hasta)
                errores[i]=desde+"-"+hasta+" es el rango permitido";
            else errores[i]="";
            return errores[i].equals("");
        }
    public boolean soloNumeros(String s,int i){
        if(s.length()==0){
            errores[i]= "campo obligatorio";
        }
        else if(!s.matches("\\d+"))
              errores[i]="solo se permiten números";
          else errores[i]="";
        return errores[i].equals("");
    }
    
    public void validarTexto(String texto,int i){
        
        if(texto.length()==0){
            errores[i]="campo obligatorio";
        }
        else if(!texto.matches("[A-ZÑÁ-ÚÜ]+(\\s[A-ZÑÁ-ÚÜ]+)*")){
            errores[i]="ha ingresado un carácter no válido";
        }
        else errores[i]="";
    }
    
     public boolean validar(){
           int i;
     for(i=0;i<3;i++){
         if(!errores[i].equals(""))
             break;
     }
    
        return i==3;
     
    }
}
