import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Фютер")
@Epic("епик")
public class TestAllure {

    TestMethod testMethod = new TestMethod();

    @Test
    public void firstTest() {
        testMethod.firstMethod();
        testMethod.secondMethod();
        testMethod.thridMethod();
    }
    
    @Test
    public void firstTest123() {
        testMethod.firstMethod();
        testMethod.secondMethod();
        testMethod.thridMethod();
    }
    
    @Test
    public void firstTest123123() {
        testMethod.firstMethod();
        testMethod.secondMethod();
        testMethod.thridMethod();
    }
}
