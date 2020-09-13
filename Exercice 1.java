public class Fraction(a, b){
    int division;
    division = a / b;
      
    System.out.println("a = " + a + ", b = " + b);
    System.out.println("La fraction vaut " + division);

}


public static int pgcd (int a, int b){
        /** 
    
        System.out.printpgcd(a, b);
        */

    }


public Fraction(int num, int den){
    int num;
    int den;
} 

public int getNumerateur(num){
    /**
    System.out.println("le numerateur est " + num);
    */
}



public int getDenominateur(den){
    /**
    System.out.println("le denominateur est " + den);
    */

}

public void setDenominateur(int nd){
    int den = nd;
    /**
    System.out.println("le nouveau denominateur est " + den);
    */
}
public void setNumerateur(int nn){
    int num = nn;

    /**
    System.out.println("le nouveau numérateur est " + num);
    */
}



public boolean equalsA(Fraction f) {
        return (num * f.den) ==  (den * f.num);

}



public void ajoute(Fraction f){
    int ndem = den * f.den;
    int nnum = (ndem/den * num) + (ndem/f.den * f.num);
    System.out.println(num+"/"+den+" + "+f.num+"/"+f.den+" = "+nnum+"/"+ndem);

}

public void reduire(){
    if (den==0) return num;
    return GCD(den,num%den);
    
}

public static int pgcd(int a, int b) {
    int c;
    while (b != 0) {
    c = a % b;
    a = b;
    b = c;
    }
    return a;
}
 


public void inverse(){
    int nnum = - num;
    System.out.println(nnum+"/"+den);

}
 


public void multiplierParCoeff(int i){
    int i;
    int nnum = i * num;
    System.out.println(nnum+"/"+den);

}




    


