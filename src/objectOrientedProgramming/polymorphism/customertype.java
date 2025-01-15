package objectOrientedProgramming.polymorphism;

public class customertype {
    public static void main(String[] args) {
        members member = new members();
        admin administrator = new admin();
        normalMember normal = new normalMember();
        members[] VSLAcustomers = {
                member, administrator, normal
        };
        // by putting member as the data type of the array this means that all the other classes identify as their parent class or their normal class
        for (int i = 0; i < VSLAcustomers.length; i++) {
            VSLAcustomers[i].sacco();

        }
        // or we can use an enhanced loop
        for (members x : VSLAcustomers) {
            x.sacco();

        }
    }
}

