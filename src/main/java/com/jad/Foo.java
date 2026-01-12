package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Corge corge;
    private List<Grault> graults = new ArrayList<>();
    private Qux qux = new Qux();
    private List<Baz> bazs;
    private Bar bar;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
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

    public void addGrault() {
        graults.add(new Grault(this));
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
