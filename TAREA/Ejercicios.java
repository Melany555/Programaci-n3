package TAREA;

import java.util.Scanner;

public class Ejercicios {
    public String Ejercicio_1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros (N):");
        int N = sc.nextInt();
        int [] numeros = new int [N];
        int suma = 0;


        for (int i = 0; i < N; i++){
            System.out.println("Ingrese los "+ (i + 1) + " numeros:");
            numeros [i] = sc.nextInt();
            suma += numeros[i];
        }

        sc.close();
        return "La suma de los numeros es: " + suma;
    }

    public int[] Ejercicio_2netoPagar(int[] sueldos, int[] asignaciones, int[] deduciones){
        int[] neto = new int [sueldos.length];
        for(int i = 0; i < sueldos.length; i++){
            neto[i] = sueldos[i] + asignaciones[i] - deduciones[i];
        }
        return neto;
    }

    public int[] Ejercicio_3SumaImpares(int[] numeros){
        int sumaPares = 0, sumaImpares = 0;
        for (int num : numeros){
            if (num % 2 == 0) {
                sumaPares += num;
            } else {
                sumaImpares += num;
            }
        }    
        return new int[]{sumaPares, sumaImpares}; 
    }

    public int Ejercicio_4mayorValor(int[] edades1, int[] edades2){
        int mayor = edades1[0];
        for (int edad: edades1){
            if (edad > mayor) {
                mayor = edad;
            }
        }
        for(int edad: edades2){
            if(edad > mayor){
                mayor = edad;
            }
        }
        return mayor;
    }

    public void Ejercicio_5totalGastado(double[] precios, int[] cantidades, String[] descripciones){
        double[] totalGastado = new double[precios.length];
        double totalGeneral = 0;
        double maxGasto = 0;
        String productoMax = "";

        for (int i = 0; i < precios.length; i++){
            totalGastado[i] = precios[i] * cantidades[i];
            totalGeneral += totalGastado[i];
            if(totalGastado[i] > maxGasto){
                maxGasto = totalGastado[i];
                productoMax = descripciones[i];
            }
        }
        System.out.println("Total general de compras: " + totalGeneral);
        System.out.println("Producto con mayor gasto: " + productoMax + " con un total de " + maxGasto);
    }

    public double[] Ejercicio_6gananciasViviendas(double[] alquileres, double[] porcentajes){
        double[] ganancias = new double[alquileres.length];
        for (int i = 0; i < alquileres.length; i++){
            ganancias[i] = alquileres[i] * porcentajes[i] / 100;
        }
        return ganancias;
    }

    public int[][] Ejercicio_7SepararParesImpares(int[] arreglo){
        int[] pares = new int[arreglo.length];
        int[] impares = new int[arreglo.length];
        int countPares = 0, countImpares = 0;

        for (int num : arreglo){
            if (num % 2 == 0){
                pares[countPares++] = num;
            } else {
                impares[countImpares++] = num;
            }
        }
        return new int[][]{pares, impares};
    }

    public void Ejercicio_8mayorMenorRepeticiones(int[] numeros){
        int mayor = numeros[0], menor = numeros[0];
        int repMayor = 0, repMenor = 0;
        
        for (int num : numeros) {
            if(num > mayor){
                mayor = num;
            }
            if (num < menor){
                menor = num; 
            }
        }
        
        for (int num : numeros){
            if (num == mayor){
                repMayor++;
            }
            if (num == menor){
                repMenor++;
            }    
        }      
        System.out.println("Mayor: " + mayor + " se repite " + repMayor + " veces");
        System.out.println("Menor: " + menor + " se repite " + repMenor + " veces");
    }

    public int Ejercicio_9contarOcurrencias(int[] arreglo, int numero){
        int count = 0;
        for (int num : arreglo){
            if (num == numero){
                count++;
            }
        }
        return count;
    }

    public int[] Ejercicio_10sumaOpuestos(int[] arreglo){
        int[] suma = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++){
            suma[i] = arreglo[i] + arreglo[arreglo.length - 1 - i];
        }
        return suma;
    }

    public int[][] Ejercicio_11separarNegativosCerosPositivos(int[] arreglo){
        int[] negativos = new int[arreglo.length];
        int[] ceros = new int[arreglo.length];
        int[] positivos = new int[arreglo.length];
        int countNeg = 0, countCeros = 0, countPos = 0;

        for (int num : arreglo){
            if(num < 0){
                negativos[countNeg++] = num;
            } else if (num == 0){
                ceros[countCeros++] = num;
            } else {
                positivos[countPos++] = num;
            }
        }
        return new int[][]{negativos, ceros, positivos};
    }

    public int[] Ejercicio_12posicionesElementos(int[] arreglo, int x){
        int[] posiciones = new int[arreglo.length];
        int count = 0;

        for (int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == x){
                posiciones[count++] = i + 1;
            }
        }

        int[] resultado = new int[count];
        System.arraycopy(posiciones, 0, resultado, 0, count);
        return resultado;
    }
    
    public int[][] Ejercicio_13elementosMayoresMedia(int[] arreglo){
        double media = 0;
        for (int num : arreglo){
            media += num;
        }
        media /= arreglo.length;

        int[] mayores = new int[arreglo.length];
        int[] menores = new int[arreglo.length];
        int countMayores = 0, countMenores = 0;

        for (int num : arreglo){
            if (num > media){
                mayores[countMayores++] = num;
            } else if (num < media){
                menores[countMenores++] = num;
            }
        }
        return new int[][]{mayores, menores};
    }
    public int [] Ejercicio_14diferenciaElementosSucesivos(int [] arreglo) {
        int [] diferencias = new int [arreglo.length - 1];
        for (int i = 0; i < diferencias.length; i++){
            diferencias[i] = arreglo[i] - arreglo[i+1];
        }
        return diferencias;
    }

    public void Ejercicio_15sueldoPromnedio(){

        String nombres[] = {"Julian","Pepito","Carolina","Francisco","Manuela"};
        int sueldos[] = {3000, 4000, 5000, 6000, 7000};

        double suma = 0;
        for (double sueldo : sueldos){
            suma += sueldo;
        }
        double promedio = suma / sueldos.length;

        for (int i = 0; i < sueldos.length; i++){
            if(sueldos [i] == promedio){
                System.out.println(nombres[i]+" Tiene un sueldo promedio:" + sueldos[i]);
            }
            else {
                System.out.println("Nadie tiene el sueldo promedio");
            }
        }
        
    }


}

    



