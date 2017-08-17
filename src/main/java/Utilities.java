
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
    
    
}
