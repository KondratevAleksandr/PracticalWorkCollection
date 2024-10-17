package com.company;

public class SimpleFilter implements Filter {


    @Override
    public Object apply(Object o) {
        return o + " applied";
    }
}
