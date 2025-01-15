package serializingAndDeserializing.serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializing {public static void main(String[]args) throws IOException {
    User info=new User();
    info.name="Abbasa";
    info.ID=800;
    FileOutputStream file=new FileOutputStream("bytedance.ser");
    ObjectOutputStream object=new ObjectOutputStream(file);
    object.writeObject(info);
    object.close();


}
}
