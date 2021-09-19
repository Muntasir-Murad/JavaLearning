public class CallingStudentsClasss {
    public static void main(String[] args) {


        Students student1= new Students();
        Students student2= new Students();
        Students student3= new Students();

        student1.name= "Muntasir";
        student1.id= "001";
        student1.gpa = 3.5;


        student2.name= "Billah";
        student2.id= "002";
        student2.gpa = 3.9;

        student3.name= "Murad";
        student3.id= "003";
        student3.gpa = 4.0;




        System.out.println("Name     Id     GPA");
        System.out.println(student1.name+"  "+ student1.id);
        student1.displayGpa();
        System.out.println(student2.name+"  "+ student2.id);
        student2.displayGpa();
        System.out.println(student3.name+"  "+ student3.id);
        student3.displayGpa();


    }//end of main
}//end of class
