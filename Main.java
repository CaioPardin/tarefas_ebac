package br.com.cpardin;

public class Main {

    public static void main(String[] args) {
        FabricaDeCarros factory = new FabricaDeCarrosImpl();

        Car sedan = factory.createSedan();
        sedan.assemble();

        Car hatch = factory.createHatch();
        hatch.assemble();

        Car suv = factory.createSuv();
        suv.assemble();
    }

}
