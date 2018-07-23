package action;
import controller.ClassControllerForCalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Class ClassActionListnerForCalculator which perfomed each event from pushed buttons
 * @author  AlexMiranovich
 *
 */

public class ClassActionListnerForCalculator implements ActionListener {

    /**
     * Method actionPerformed overriding for find action command
     * and perfom her
     */
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        ClassControllerForCalculator controller=new ClassControllerForCalculator();
        controller.clickButton(cmd);
    }

}
