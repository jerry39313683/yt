public class Shape{
    public double r = 0 , de = 0 , a = 0 , b = 0 ; //半徑 角度 邊長的變數
    public static int count = 0; //物件個數
    
    //圓形建構元
    public Shape(double r) {
        setCircle(r); 
        count++;
    }
    //長方形建構元
     public Shape(double w, double h) {
        setRectangle(w, h); 
        count++;
        }
    //三角形建構元
    public Shape( double a, double b, double de ){
        setTriangle(a, b, de); 
        count++;
    }
    //數據回傳
    public void setCircle(double r) {
        this.r = r;
    }
    public void setRectangle(double w, double h){
        this.a = w; 
        this.b = h;
    }

    public void setTriangle(double a, double b , double de){
        this.a = a; 
        this.b = b; 
        this.de = Math.toRadians(de);
    }

    public double getPerimeter() { 
        if (r != 0)       { return 2 * r * Math.PI; } //如輸入的是圓的半徑 則回傳圓的周長

        else if (de == 0) { return 2 * (a + b); } //在沒有輸入角度條件下 回傳長方形周長

        else              { return a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(de));} //如有輸入角度 則將角度帶入公式求三角形周長
    } 
        
    public double getArea() {

        if (r != 0)       { return r * r * Math.PI; } //如輸入的是圓的半徑 則回傳圓的面積
        
        else if (de == 0) { return a * b; } //在沒有輸入角度條件下 回傳長方形面積
        
        else              { return a * b * Math.sin(de) / 2;} //如有輸入角度 則將角度帶入公式求三角形面積
    }        

    public static int getCount(){
        return count;
    }
}