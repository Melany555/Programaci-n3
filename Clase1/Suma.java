public class Suma {
     public static void main(String[] args) {
        int [] a = {4, 8, 2, 1, 6};
        System.out.println(sumaParesImparesArreglo(a));
        
     }
     public static String sumaParesImparesArreglo (int [] a){
        int sumaPares = 0, sumaImpares = 0;
        String cad = "";

        for (int i = 0; i < a.length; i++){
            if (a[i]%2 == 0) {
                sumaPares += a[i];
            }else{
                sumaImpares += a[i];
            }

        }
        cad = "La suma de los numeros pares = " + sumaPares + " suma de los números impares = " + sumaImpares;
        return  cad;
     }
      public static String sumaExtremosArreglo(int[] a){
        String cad = "";
  //Verificamos si el arreglo es par o impar

        if(a.length%2==0){
            //El arreglo es par 

            for (int i = 0; i < a.length/2; i++){
                cad += (a[i]+ (a[a.length-1-i]))+ "";
            }
            
        }else{
           //El arreglo es impar  
           
           cad+="Arreglo impar";  
        }
            return cad;
      } 
}
