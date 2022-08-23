import io.qameta.allure.Step;

public class TestMethod {


    @Step("firstMethod")
    public void firstMethod() {
        System.out.println("firstMethod");
        secondMethod();
    }

    @Step("secondMethod")
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    @Step("thridMethod")
    public void thridMethod() {
        System.out.println("thridMethod");
    }
}
