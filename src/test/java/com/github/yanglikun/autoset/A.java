package com.github.yanglikun.autoset;

public class A {

    private B b;

    public void setB(B b) {
        this.b = b;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("A{");
        sb.append("b=").append(b);
        sb.append('}');
        return sb.toString();
    }
}
