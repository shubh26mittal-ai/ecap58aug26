package oops;

//public class TypesOfVariables {
	//int a = 10;
	//static int b = 20;

	//public static void main(String[] args) {
		//int c =100;

//public class TypesOfVariables {//

  //  int a = 10;

    //public static void main(String[] args) {
      //  System.out.println(new TypesOfVariables().a);

        //TypesOfVariables t = new TypesOfVariables();
        //System.out.println(t.a);//10

//public class TypesOfVariables {//Static variables

   // int a = 10;

    //public static void main(String[] args) {
      //  System.out.println(new TypesOfVariables().a);

        //TypesOfVariables t = new TypesOfVariables();
        //System.out.println(t.a);

        // ✅ access through object, not class name
        //System.out.println(t.a);

        // ✅ access through a new object
        //System.out.println(new TypesOfVariables().a);

//public class TypesOfVariables {

  //  public void m1(int a) {
    //    System.out.println(a);
      //  int b = 50;
        //System.out.println(b);//50
    //}
//public static void main(String[] args) {
        //TypesOfVariables t = new TypesOfVariables();
        //t.m1(5);//5 local variables

//public class TypesOfVariables {

  //  public void simple() {
    //    System.out.println("Non static / instance Methods");//Non static / instance Methods
    //}

    //public static void test() {
      //  System.out.println("Static methods");//Static methods
    //}

    //public static void main(String[] args) {
      //  new TypesOfVariables().simple();

        //TypesOfVariables t = new TypesOfVariables();
        //t.simple();

        //TypesOfVariables.test();
        //test();   // ✅ parentheses added
    }
}



