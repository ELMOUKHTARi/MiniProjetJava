
package loginandsignup;

import java.io.IOException;
import swing.Home;



public class LoginAndSignUp {

    public static void main(String[] args) throws IOException, ClassNotFoundException  {
 
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
    }
    
}
