package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    Bar bar;
    List<Baz> bazs;
    Qux qux = new Qux();

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
}
