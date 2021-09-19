public class Parameter {

    String name;
    int age;
    double money;


        void sendinfo(String name,int a, double m){
           this.name=name;
           age=a;
           money=m;


        }

    void displayinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(money);
    }



}
