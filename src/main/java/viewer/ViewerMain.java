package viewer;

import controller.ControllerMain;
import model.ModelMain;

import java.util.Scanner;

import static controller.ControllerMain.average;


public class ViewerMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name? plz");
        String name=input.nextLine();
       ControllerMain controllerMain=new ControllerMain();
        ModelMain modelMain=new ModelMain();

            controllerMain.check(average(modelMain.marks()));

    }



}
