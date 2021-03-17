package form;
//@author Ghaisani

public class Form {

    public static void main(String[] args) {
        Register rg = new Register();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
    }
    
}
