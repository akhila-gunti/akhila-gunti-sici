package housetask4;

import java.util.InputMismatchException;

import java.util.Scanner;



public class mainclass {

	private static Scanner sc;

	public static void main(String[] args) {



        sc = new Scanner(System.in);



        double areaOfHouse = 0;

        String typeOfMaterial;

        boolean automationRequired = false;

        try {

            System.out.println("Enter the Area of the House : ");

            areaOfHouse = sc.nextDouble();



        } catch (InputMismatchException misMatchInput) {

            System.out.println(misMatchInput.getMessage());

        }



        System.out.println("Select Material Standard: ");

        materialstandards.getMaterialType();

        System.out.println("Input : ");

        typeOfMaterial = sc.next();



        if (typeOfMaterial.toLowerCase().equals(materialstandards.Standards.HighStandardMaterial.toString().toLowerCase())) {

            System.out.println("Required automation (true/false) : ");

            automationRequired = sc.nextBoolean();

        }



        costestimate calculateCost = new costestimate();

        try {

            System.out.println("Estimated Cost Of Construction Is: " + calculateCost.getCost(areaOfHouse, typeOfMaterial, automationRequired));

        } catch (invalidmaterialselect invalidMaterial) {

            System.out.println(invalidMaterial.getMessage());

        }



    }


}
