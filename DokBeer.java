package Lab3;
import java.util.Scanner;
public class DokBeer {
    private double TotalMoney , BaseMoney , DokBeer;

    //Constructor Method
    DokBeer(double BaseMoney , double DokBeer) {
        this.BaseMoney = BaseMoney;
        this.DokBeer = DokBeer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter BaseMoney : ");
        Double n1 = scan.nextDouble();
        System.out.print("Enter DokBeer : ");
        Double n2 = scan.nextDouble();
        DokBeer D1 = new DokBeer(n1 , n2);
        System.out.println(D1.toString());
    }

    //Setter Method
    public void setBaseMoney(double BaseMoney) {
        this.BaseMoney = BaseMoney;
    }
    
    public void setDokBeer(double DokBeer) {
        this.DokBeer = DokBeer;
    }

    public void setTotalMoney(double TotalMoney) {
        this.TotalMoney = TotalMoney;
    }
    
    //Getter Method
    public double getBaseMoney() {
        return this.BaseMoney;
    }
    
    public double getDokBeer() {
        return this.DokBeer;
    }

    public double getTotalMoney() { 
        return this.TotalMoney;
    }

    public void CalTotalMoney(double BaseMoney , double DokBeer) {
        double TotalMoney = BaseMoney /100 * DokBeer + BaseMoney;
        setTotalMoney(TotalMoney);
    }

    public String toString() {
        CalTotalMoney(BaseMoney , DokBeer);
        String s1 = "==============================\n" + "Basemoney : " + BaseMoney + "\n" + "Dokbeer : " + DokBeer + "\n" + "TotalMoney : " + TotalMoney + "\n==============================";
        return s1;
    }
}
