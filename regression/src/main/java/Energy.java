

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="energy") 
public class Energy {
 
    @Id
    @Column(name = "id")
    private int id;
 
    @Column(name = "X1")
    private double x1;
 
    @Column(name = "X2")
    private double x2;

    @Column(name = "X3")
    private double x3;
 
    @Column(name = "X4")
    private double x4;
    
    @Column(name = "X5")
    private double x5;
 
    @Column(name = "X6")
    private double x6;

    @Column(name = "X7")
    private double x7;

    @Column(name = "X8")
    private double x8;
    
    @Column(name = "Y1")
    private double y1;
    

    
    public Energy() {
 
    }
 
    public Energy(int id, double x1, double x2, double x3, double x4, double x5, double x6, double x7, double x8, double y1) {
        this.setId(id);
        this.setX1(x1);
        this.setX2(x2);
        this.setX3(x3);
        this.setX4(x4);
        this.setX5(x5);
        this.setX6(x6);
        this.setX7(x7);
        this.setX8(x8);
        this.setY1(y1);
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public double getX1() {
        return x1;
    }
 
    public void setX1(double x1) {
        this.x1 = x1;
    }
 
    public double getX2() {
        return x2;
    }
 
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    public double getX3() {
        return x2;
    }
 
    public void setX3(double x3) {
        this.x3 = x3;
    }
    
    public double getX4() {
        return x4;
    }
 
    public void setX4(double x4) {
        this.x4 = x4;
    }
    
    public double getX5() {
        return x5;
    }
 
    public void setX5(double x5) {
        this.x5 = x5;
    }

    public double getX6() {
        return x6;
    }
 
    public void setX6(double x6) {
        this.x6 = x6;
    }

    
    public double getX7() {
        return x7;
    }
 
    public void setX7(double x7) {
        this.x7 = x7;
    }

    public double getX8() {
        return x8;
    }
 
    public void setX8(double x8) {
        this.x8 = x8;
    }
    
    
    public double getY1() {
        return y1;
    }
 
    public void setY1(double y1) {
        this.y1 = y1;
    }
    
    
}

