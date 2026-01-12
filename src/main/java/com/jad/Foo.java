package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    List<Baz> bazs;
    Qux qux = new Qux();
    Corge corge;
    List<Grault> graults = new ArrayList<>();
    private Bar bar;

    public Foo() {
        this.bar = new Bar();
        this.bazs = new ArrayList<>();
        this.corge = new Corge(this);
        graults.add(new Grault(this));
    }

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.corge = new Corge(this);
        graults.add(new Grault(this));

    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public List<Grault> getGraults() {
        return this.graults;
    }

    public void addBaz(Baz baz) {
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
}
