package org.homeTask;
import java.io.IOException;
import java.util.*;
public class ClientApp1 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        System.out.write("press 1 for standard material(cost per square feet: 1200INR)\npress 2 for above standard material(cost per square feet: 1500INR)\npress 3 for high standard(cost per square feet: 1800INR non-automated and 2500INR automated)\npress 4 to exit\n".getBytes());
        do {
            System.out.write("\nEnter your choice:".getBytes());
            int materialStd = sc.nextInt();
            boolean automatedType = false;
            constructionCost c = new constructionCost();
            int cost, houseArea;
            switch (materialStd) {
                case 1:
                    System.out.write("Enter house area:".getBytes());
                    houseArea = sc.nextInt();
                    cost = c.standardHouseCost(houseArea);
                    System.out.write(("Cost of standard house of area " + houseArea + " square feet is Rs" + cost).getBytes());
                    break;
                case 2:
                    System.out.write("Enter house area:".getBytes());
                    houseArea = sc.nextInt();
                    cost = c.aboveStandardHouseCost(houseArea);
                    System.out.write(("Cost of above standard house of area " + houseArea + " square feet is Rs" + cost).getBytes());
                    break;
                case 3:
                    System.out.write("Enter house area:".getBytes());
                    houseArea = sc.nextInt();
                    if (materialStd == 3) {
                        System.out.write("Do you want house to be fully automated? Enter yes/no:".getBytes());
                        String choice = sc.next();
                        if (choice.equals("yes")) {
                            automatedType = true;
                        }
                    }
                    cost = c.highStandardHouseCost(houseArea, automatedType);
                    if (automatedType) {
                        System.out.write(("Cost of high standard and automated house of area " + houseArea + " square feet is Rs" + cost).getBytes());
                    } else {
                        System.out.write(("Cost of high standard house of area " + houseArea + " square feet is Rs" + cost).getBytes());
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.write("Exiting..".getBytes());
                    break;
                default:
                    System.out.write("Enter correct choice! ".getBytes());
            }
        }
        while (exit != true);
    }
}
