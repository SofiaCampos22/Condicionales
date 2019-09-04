package condicionales;

import java.util.Scanner;

public class IfClass {
    public IfClass(){
    //Constructor de nuestra clase
    }
  Integer n1=0, n2=0, n3=0;
  double num1=0, num2=0, num3=0;

public void setIgual(int x, int y){
    this.n1 = x;
    this.n2 = y;
    
    if(n1==n2){
        System.out.println("Los números son iguales.");
    }else{
        System.out.println("Los números son diferentes.");
    }    
}  

public void setMayor(int x, int y){
    this.n1 = x;
    this.n2 = y;
    
    if(n1>n2){
        System.out.println("El número " +n1+ " es mayor que " +n2);
    }else{
        System.out.println("El número " +n2+ " es mayor que " +n1);
    }
}

public void setMenor(int x, int y){
    this.n1 = x;
    this.n2 = y;
    
    if(n1<n2){
        System.out.println("El número " +n1+ " es menor que " +n2);
    }else{
        System.out.println("El número " +n2+ " es menor que " +n1);
    }
}

public void max(int x, int y, int z){
    this.n1 = x;
    this.n2 = y;
    this.n3 = z;
    
    if(n1>n2 && n1>n3){
        if(n2>n3){
            System.out.println("El orden de mayor a menor es: \n" +n1+ ", " +n2+ ", " +n3);
        }else{
            System.out.println("El orden de mayor a menor es: \n" +n1+ ", " +n3+ ", " +n2);
        }
    }else if(n2>n1 && n2>n3){
        if(n1>n3){
            System.out.println("El orden de mayor a menor es: \n" +n2+ ", " +n1+ ", " +n3);
        }else{
            System.out.println("El orden de mayor a menor es: \n" +n2+ ", " +n3+ ", " +n1);
        }
    }else if(n3>n1 && n3>n2){
        if(n1>n2){
            System.out.println("El orden de mayor a menor es: \n" +n3+ ", " +n1+ ", " +n2);
        }
    }
}

public void min(int x, int y, int z){
    this.n1 = x;
    this.n2 = y;
    this.n3 = z;
    
    if(n1<=n2 && n1<=n3){
        if(n2<=n3){
            System.out.println("El orden de menor a mayor es: \n" +n1+ ", " +n2+ ", " +n3);
        }else{
            System.out.println("El orden de menor a mayor es: \n" +n1+ ", " +n3+ ", " +n2);
        }
    }else if(n2<=n1 && n2<=n3){
        if(n1<n3){
            System.out.println("El orden de menor a mayor es: \n" +n2+ ", " +n1+ ", " +n3);
        }else{
            System.out.println("El orden de menor a mayor es: \n" +n2+ ", " +n3+ ", " +n1);
        }
    }else if(n3<n1 && n3<n2){
        if(n2<n1){
            System.out.println("El orden de menor a mayor es: \n" +n3+ ", " +n2+ ", " +n1);
        }else{
            System.out.println("El orden de menor a mayor es: \n" +n3+ ", " +n1+ ", " +n2);
        }
    }
}

public void rcuadrada(double x){
    this.num1 = x;
    double r;
    
    if(n1>=0){
        r = Math.sqrt(n1);
        System.out.println("La raiz cuadrada de " +n1+ " es: " +r);
    }else{
        System.out.println("No se puede hacer la raiz cuadrada. ");
    }
}

public void fcuadratico(double x, double y, double z){
    this.num1 = x; //a
    this.num2 = y; //b
    this.num3 = z; //c
    
    double f1, f2, r;
    
    if(((Math.pow(2, y)) - (4*x*z))<0){
        System.out.println("No es posible calcular, raíz cuadrada negativa");
    }else{
        r = Math.sqrt((Math.pow(2, y)) - (4*x*z));
    f1 = (-(y) + r) / (2*x);
    f2 = (-(y) - r) / (2*x);
    System.out.println("Los resultados son: \nx1=" +f1+ ", x2=" +f2);
    }     
}

public void resta(int x, int y){
    this.n1 = x;
    this.n2 = y;
    
    System.out.println("La resta es: " +(n1-n2));
}

public void suma(int x, int y){
    this.n1= x;
    this.n2 = y;
    
    System.out.println("La suma es: " +(n1+n2));
}

public void mult(int x, int y){
    this.n1 = x;
    this.n2 = y;
    
    System.out.println("La multiplicación es: " +(n1*n2));
}

public void div(int x, int y){
    this.n1 = x;
    this.n2 = y;
    
    System.out.println("La división es: " +(n1/n2));
}

public void AND(int x, int y){
    this.n1 = x;
    this.n2 = y;
    
    if(n1>10 && n2>10){
        System.out.println("Ambos números son mayores a 10");
    }else{
        System.out.println("1 o Ambos son menores o iguales a 10");
    }
}

public void OR(int x, int y){
    this.n1 = x;
    this.n2 = y;
    int m, m1;
    m = n1%2;
    m1 = n2%2;
    
    if(m==0 || m1==0){
        System.out.println("Uno de los números es par");
    }else{
        System.out.println("Ninguno de los números es par");
    }
}

public void NOT(int x, int y){
    this.n1 = x;
    this.n2 = y;
    int m;
    m = x%y;
    
    if(m != 0){
        System.out.println(x+ " no es divisible dentro de " +y);
    }else{
        System.out.println(x+ " es divisible dentro de " +y);
    }
}

public void menu(){
    Scanner sc = new Scanner(System.in);
        char op;
        int n, a=0, b=0, c=0, r;
        double a1=0.0, b1=0.0, c1=0.0;

        do {
            System.out.println("Ingrese una opcion: \n1. Igualdad \n2. Mayor que \n3. Menor que \n4. Maximo \n5. Minimo \n6. Raíz Cuadrada \n7. Ecuación Cuadratica"
                    + "\n8. Suma \n9. Resta \n10. Multiplicacion \n11. Division \n12. Operador Logico AND \n13. Operador OR \n14. Operador NOT");
            n = sc.nextInt();
            
            do{
            System.out.println("Desea: \n1. Introducir valores \n2. Valores Aleatorios");
            r = sc.nextInt();
            if(r==1){
               if(n==1 || n==2 || n==3 || n==8 || n==9 || n==10 || n==11 || n==12 || n==13 || n==14){
                   System.out.println("Ingrese Num1: ");
                   a = sc.nextInt();
                   System.out.println("Ingrese Num2: ");
                   b = sc.nextInt();
               }else if(n==4 || n==5){
                   System.out.println("Ingrese Num1: ");
                   a = sc.nextInt();
                   System.out.println("Ingrese Num2: ");
                   b = sc.nextInt();
                   System.out.println("Ingrese Num1: ");
                   c = sc.nextInt();
            }else{
                   System.out.println("Ingrese Num1: ");
                   a1 = sc.nextDouble();
                   System.out.println("Ingrese Num2: ");
                   b1 = sc.nextDouble();
                   System.out.println("Ingrese Num3: ");
                   c1 = sc.nextDouble();
               } 
            }else{
                if(n==1 || n==2 || n==3 || n==8 || n==9 || n==10 || n==11 || n==12 || n==13 || n==14){
                   a = 1+(int)(Math.random()*55);
                   b = 1+(int)(Math.random()*55);
               }else{
                   a1 = 1+(int)(Math.random()*55);
                   b1 = 1+(int)(Math.random()*55);
                   c1 = 1+(int)(Math.random()*55);
               } 
            }
            }while(r<=0 || r>=3);
            
            switch (n) {
                case 1:
                    setIgual(a, b);
                    break;
                case 2:
                    setMayor(a, b);
                    break;
                case 3:
                    setMenor(a, b);
                    break;
                case 4:
                    max(a, b, c);
                    break;
                case 5:
                    min(a, b, c);
                    break;
                case 6:
                    rcuadrada(a1);
                    break;
                case 7:
                    fcuadratico(a1, b1, c1);
                    break;
                case 8:
                    suma(a, b);
                    break;
                case 9:
                    resta(a, b);
                    break;
                case 10:
                    mult(a, b);
                    break;
                case 11:
                    div(a, b);
                    break;
                case 12:
                    AND(a,b);
                    break;
                case 13:
                    OR(a, b);
                    break;
                case 14:
                    NOT(a, b);
                    break;
            }
            System.out.println("¿Desea repetir el proceso? (s/n)");
            op = sc.next().charAt(0);

        } while (op == 's' || op == 'S');
}

}