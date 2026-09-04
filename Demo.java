//package modifierpack2;

//import modifierpack1.DefaultModifierEx;

//public class Demo extends DefaultModifierEx{

  //  public static void main(String[] args) {
    //    Demo d = new Demo();
      //  d.m1(); //  The method m1() from the type DefaultModifierEx is not visible
    //}
//}

package modifierpack2;

import modifierpack1.PublicModifierEx;

public class Demo extends PublicModifierEx {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m1(); // m1() method with PUBLIC modifier
    }
}