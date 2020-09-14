// On peut attendre d'un point qu'il est des coordonnées fixes

public class Point {
        private int x;
        private int y;

        private static int nbPoints = 0;

    public class Point(){
        this.x=0;
        this.y=0;


    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void translate(int a,int b){
        this.x = this.x+a;
        this.y = this.y+b;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public Point copy0f(){
        // return this; dangeureux
        // ou return new Points(this);
        // ou Point laCopie = new Points(this.x, this.y);
        //    return laCopie; -> pour segment

    }
    public static int int getNbPoints(){
        return nbPoints;
    }
}