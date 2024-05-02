package autosprogram;

public class AutosProgram {


    public static void main(String[] args) {
        //new AutosProgram().bemutato_0();
        AutosProgram prg = new AutosProgram();
        prg.bemutato_0();
        prg.bemutato_1();
        prg.bemutato_2();
        
    }

    private void bemutato_0() {
        //System.out.println("Bemutató 1:");
        Auto auto = new Auto();
        auto.megy();
        auto.setBeinditva(true);
        auto.megy();
        auto.megy();
        auto.tankol();
        auto.setBeinditva(false);
        auto.megy();
        auto.tankol();
        auto.megy();
    }
    
    private void bemutato_1() {
        //System.out.println("Bemutató 2:");
        Auto auto = new Auto(true);
    }
    private void bemutato_2() {
        //System.out.println("Bemutató 3:");
        Auto auto = new Auto(true, true);
    }
    
}
