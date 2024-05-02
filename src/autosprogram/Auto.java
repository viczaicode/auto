/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autosprogram;

/**
 *
 * @author ViczaiPéterMilán(SZO
 */
public class Auto {
    
    private static int objektumDb = 0;
    private boolean uzemanyag;
    private boolean beinditva;
    
    public Auto() {
        this(true, false);
    }
    
    public Auto(boolean beinditva) {
        this(false, beinditva);
    }
    
    public Auto(boolean uzemanyag, boolean beinditva) {
        Auto.objektumDb++;
        System.out.printf("******** %d. Bemutató ********".formatted(Auto.objektumDb));
        System.out.println("*****************************");
        this.uzemanyag = uzemanyag;
        this.beinditva = beinditva;
        String info = uzemanyag ? "van" : "nincs";
        System.out.println("Üzemanyag: "+ info);
        info = beinditva ? "van" : "nincs";
        System.out.println("beinditva: "+ info);
        System.out.println("-------------------------");
    }
    
    public void setBeinditva(boolean beindit) {
        this.beinditva = beinditva;
        if (beinditva) {
            System.out.println("A motor be van indítva");
        } else {
            System.out.println("A motor le van állítva");
        }
    }
    
    public void megy() {
        if (beinditva && uzemanyag) {
            this.uzemanyag = false;
            System.out.println("Haladunk, az autó megérkezett, de üres az tank");
        } else if(!beinditva){
            System.out.println("Nem haladtunk, az auto nincs beinditva.");
        } else if(!uzemanyag) {
            System.out.println("Nem haladtunk, mert ures a tank");
        }
    }
    
    public void tankol() {
        if (!beinditva) {
            this.uzemanyag = true;
            System.out.println("Sikerült tankolni, tele a tank");
        } else {
            System.out.println("Sikertelen tankolás, mert be van indítva a kocsi");
        }
    }
}
