package deserializer;

import java.io.*;

public class main { public static void main(String []args) throws IOException, ClassNotFoundException {
    User user;
    FileInputStream files=new FileInputStream("C:\\Users\\THINKPAD\\IdeaProjects\\Addams\\bytedance.ser");
    ObjectInputStream objects=new ObjectInputStream(files);
  user= (User) objects.readObject();
  objects.close();files.close();


}
}
// however to deserialize you should be in a different project
/*
children classes of a parent class that implements serialiazable will do so as well
static fields are not serialiased because they belong to the class not to the object
the class is not serialized but the object
fields declared as transiet are not serialised they are ignored
serialVersionUID a unique number based on the properties of the object that verifies the sender and receiver
it should correspond on both machines
long uid=ObjectsStreamClass.lookup(user.getClass()).getSerialVersionUID
 */

