package viewer;

import controller.ControllerMain;
import model.ModelMain;


public class ViewerMain {
    public static void main(String[] args) {
       ControllerMain controllerMain=new ControllerMain();
        ModelMain modelMain=new ModelMain();

            controllerMain.average(modelMain.marks());

    }



}
