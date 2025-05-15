import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 
{
@Test
void Login()
{
System.out.println("Login App");
}

@BeforeMethod
void Search()
{
System.out.println(" Go to Search");
}

@AfterMethod
void Logout()
{
System.out.println("Logout");
}

}