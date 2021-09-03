/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Macea
 */
public class Object {
    private String d;
    private String dr;
    private String g;
    private int cont;
    private String residuo;
    int temp=0;

    public Object() {
        this.d = d;
         this.d = dr;
        this.g = g;
        this.cont = cont;
        this.residuo = residuo;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }
  
    
    
    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getResiduo() {
        return residuo;
    }

    public void setResiduo(String residuo) {
        this.residuo = residuo;
    }
    
   
     public String r() {
        String r = "";
        for (int i = 0; i < getG().length() - 1; i++) {
            r = r + "0";
        }

        return r;
    }
     
      public void acumulado() {
        String x = "";
        for (int i = 0; i <= getG().length(); i++) {
            char r = getDr().charAt(i);
            x = x + r;
        }
          setResiduo(x);
        
    }
      
          public String comparacion() {
        
        setCont(cont+1);
        String com = "";
        if ('1' == (getResiduo().charAt(0))) {
            for (int i = 0; i < getG().length(); i++) {

                if (((getResiduo().charAt(i))) == (getG().charAt(i))) {
                    com = com + "0";
                } else {
                    com = com + "1";
                }
              
            }
        } else {
            for (int i =0; i <getG().length(); i++) {
                 char r = getDr().charAt(i+getCont()-1);
                 com=com+r;
             
                
            }
               
            
        }
              setResiduo(com);
              
              return com;

    }
          
          
            public void generate(){
                int i=0;
        while ((i+getG().length())!=getDr().length()) {            
            comparacion();   
           i++;
               System.out.println("CRC Found "+getResiduo());
           System.out.println("Final Message: "+getD()+getResiduo()); 
        }
           System.out.println("CRC Found "+getResiduo());
           System.out.println("Final Message: "+getD()+getResiduo());
    }
}
