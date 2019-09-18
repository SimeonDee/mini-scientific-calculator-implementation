package java2018_8;
/**********************************************************************
 * Author:      ADEYEMI ADEDOYIN SIMEON
 * Matric:      209188
 * Level:       700 (MSc, Computer Science), Univ. of Ibadan, Nigeria
 * Course:      Advanced Programming Techniques (Java)
 * ***********************************************************************/

public class CalcEngine implements ICalculator {
    private int x, y;
    
    public CalcEngine(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public CalcEngine(){
        this.x = 0;
        this.y = 0;
    }
    
    @Override
    public int Addition() {
       return this.x + this.y;
    }

    @Override
    public int Substraction() {
        return this.x - this.y;
    }

    @Override
    public int Multiplication() {
        return this.x * this.y;
    }

    @Override
    public int Division() {
        if(this.y == 0){
            return 0;
        }
        return this.x / this.y;
    }

     @Override
    public int power() {
        int answer = 1;
        for(int i = 1; i <= this.y; i++){
            answer *= this.x;
        }
        
        return answer;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
