package com.example.demo;

import java.util.Objects;

public class Test {

    private String test;

    public Test(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Test{" +
                "test='" + test + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test1 = (Test) o;
        return Objects.equals(test, test1.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test);
    }
}
