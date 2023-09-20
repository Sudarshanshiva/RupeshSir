package Guddu;
//class Rungta{
//    String name = "Shiva";
//    void run(){
//        System.out.println(name);
//    }
//
//
//}
//class Santosh extends Rungta{
//    int reg =27;
//    void fun(){
//        System.out.println(reg);
//    }
//}
//public class Main  {
//
//    public static void main(String[] args) {
//        Santosh s = new Santosh();
//        s.run();
//        s.fun();
//
//    }
//}
//class college {
//    void getstudentDetail(String name ,long rollNo) {
//        System.out.println(name);
//        System.out.println(rollNo);
//
//    }
//}
//class Student extends college {
//    void getExamDetails(String subject){
//        System.out.println(subject);
//
//    }
//}
//class Exam extends Student {
//    college c1 = new college();
//    Student s1 = new Student();
//}
//
//
//    public class Main{
//        public static void main(String[] args) {
//            Exam e1 =new Exam();
//            e1.getstudentDetail("Shiva",301);
//            e1.getExamDetails("Math");
//
//
//
//
//    }
//
//}



//exceptional handling programe
class Sample{
 void divide (int a,int b){
         int result;
         try{
         result=a/b;
         }
         catch(ArithmeticException ex){
         System.out.println("Arithematic Exception");
         }}}
class Exception{
    public static void main(String[] args) {
        Sample s = new Sample();
        s.divide(10,0);
    }}








