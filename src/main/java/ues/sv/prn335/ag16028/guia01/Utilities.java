package ues.sv.prn335.ag16028.guia01;

public class Utilities {
    
    public String getResume(String texto){
        String cadena="";
      if(texto.length()<30){
          cadena=texto;
      }else{
          for(int i =0; i<30;i++) {
              cadena+=texto.charAt(i);  
            }
      }
        return cadena;
    }
     
    
    public String catalizar(String texto){
        String cadena="",caracter,mayus;
        if(!texto.equals("")){
            for(int i=0;i<texto.length();i++){
                caracter=String.valueOf(texto.charAt(i));
                if(i>0){
                    if(caracter.equals(" ")){
                        if(caracter.equals(String.valueOf(texto.charAt(i-1)))){                                
                        }else{   
                          cadena+=texto.charAt(i);
                        }  
                        
                    }else{
                           if (String.valueOf(texto.charAt(i-1)).equals(" ")){
                              cadena+=String.valueOf(texto.charAt(i)).toUpperCase(); 
                           }else{
                               cadena+=texto.charAt(i);
                           }
                    }
                }else{
                    cadena+=String.valueOf(texto.charAt(i)).toUpperCase();
                }
            }    
        }  
        return cadena;
    }
   
    
    
}
