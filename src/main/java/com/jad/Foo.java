package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    Bar bar;
    List<Baz> bazs;
    Qux qux = new Qux();
    List<Grault> graults = new ArrayList<>();

    public List<Grault> getGraults() {
        return this.graults;
    }

    public void addBaz(Baz baz){
        bazs.add(baz);
    }



    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public Bar getBar() {
        return this.bar;
    }

    public Foo() {
        this.bar = new Bar();
        this.bazs = new ArrayList<>();
    }

    public Foo(Bar bar){
        this.bar = bar;
        this.bazs = new ArrayList<>();
    }
}
