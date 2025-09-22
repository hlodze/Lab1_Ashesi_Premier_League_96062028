import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {


        String name;
        int age;
        float height;
        float weight;
        int jerseynumber;

        Scanner Name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = Name.nextLine();

        Scanner Age = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = Age.nextInt();

        Scanner Weight = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        weight = Weight.nextFloat();

        Scanner Height = new Scanner(System.in);
        System.out.print("Enter your height: ");
        height = Height.nextFloat();

        Scanner Jersey = new Scanner(System.in);
        System.out.print("Enter your Jersey number: ");
        jerseynumber = Jersey.nextInt();

        final float pound=0.45359237f;
        final int meter=100;
        float weight_kg=weight*pound;
        float height_meters=height*meter;
        int new_weight = (int) weight_kg;
        int new_height = (int) height_meters;

        String category;
        if (age<20){
            category = "Rising Star";
        } else if (age<=30) {
            category = "Prime Player";
            }
        else {
            category = "Veteran";
        }
        String decision;
        if (category.equals("Rising Star")) {
            if (new_weight < 80) {
               decision="Starting lineup";
            } else {
                decision=("Bench");
            }
        }
        else{
            decision=("Bench");}
        String position = switch (jerseynumber) {
            case 1 -> ("Goalkeeper");
            case 2, 5 -> ("defender");
            case 7, 11 -> ("winger");
            case 6, 8 -> ("Midfielder");
            case 9 -> ("Striker");
            case 10 -> ("Playmaker");
            default -> ("Player position not found");
        };

        System.out.println("Player: "+ name);
        System.out.println("Age:"+ age+ "(" +category+")");
        System.out.println("Height: "+ new_height);
        System.out.println("Weight: "+ new_weight);
        System.out.println("Jersey: "+ jerseynumber);
        System.out.println("Position: "+ position);
        System.out.println("Lineup decision: "+ decision);
        String Eligibility = (age > 18 && age < 35 && new_weight < 90) ? "Eligible" : "Not Eligible";
        String AttackerStatus = (position.equals("Striker") || position.equals("Playmaker") || position.equals("Midfielder")) ? "Yes" : "NO";
        String Finaldecision = (age > 18 && age < 35 && new_weight < 90) ? "Eligible" : "Not Eligible";

//        System.out.println()
//        System.out.println()
//        System.out.println()
//        System.out.println()
//        System.out.println()
        ;
    }
}
