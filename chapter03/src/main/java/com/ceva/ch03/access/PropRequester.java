package com.ceva.ch03.access;

public class PropRequester {
    public PropRequester(){
        PropProvider provider = new PropProvider();
        provider.publicProp = 7;
        provider.protectedProp = 8;
        provider.defaultProp = 9;
        // provider.privateProp = 10;
    }
}
