package fundamentals;

public class array {
    public static void main(String[]args){
        String [] dogs={"pitbull","german shepherd","local"};
        System.out.println(dogs[1]);
        String[]cars=new String[3];
        //here we can use user input to accesss it

        cars[0]="fienta";
        cars[1]="sienta";
        cars[2]="rumion";
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        for (String car : cars) {
            System.out.println(car);
        }
        // multi dimensional arrays have rows and columns


        }

    }

