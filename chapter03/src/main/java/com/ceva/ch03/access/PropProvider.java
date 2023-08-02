package com.ceva.ch03.access;

public class PropProvider {
    public int publicProp;
    protected int protectedProp;
    int defaultProp;
    private int privateProp;

    public PropProvider(){
        this.privateProp = 0;
    }

    public void printPrivate(){
        System.out.printf("Private member: %d", privateProp);
    }

    // clase anidada
    class LocalPropRequester{
        public LocalPropRequester(){
            PropProvider provider = new PropProvider();
            provider.publicProp = 1;
            provider.protectedProp = 2;
            provider.defaultProp = 3;
            provider.privateProp = 4;
        }
    }
}
