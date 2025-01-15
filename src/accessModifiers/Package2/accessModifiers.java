package accessModifiers.Package2;

import accessModifiers.Package1.Parent;

public class accessModifiers {public static void main (String[] args){
    /* there are four access modifiers and they are ;
                world  class subclass package
    public        Y      Y      Y      Y
    protected     N      Y      y      Y
    default       N      y      Y      N
    private       N      Y       N     N
     */
    child Child=new child();
    Parent parent =new Parent();

}
}
