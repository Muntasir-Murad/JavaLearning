public class BasePage {
    public static void main(String[] args) {

        LoginPage loginPage=new LoginPage();

        loginPage.a=5;
        loginPage.b=10;
        loginPage.LoginPage();


        LoginPage loginPage2=new LoginPage();
        loginPage2.a=10;
        loginPage2.b=10;
        loginPage2.LoginPage();
    }
}
