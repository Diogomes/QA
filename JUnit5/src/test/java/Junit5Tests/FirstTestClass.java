package Junit5Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTestClass {

    @Test
    void firstMethod(){
        System.out.println("This is the first method");
    }

    @Test
    @DisplayName("")
    void secondMethod(){
        System.out.println("This is the second method");
    }
}
//regex [A-Z][A-Za-z\d]*Test(s|Case)?|Test[A-Z][A-Za-z\d]*'