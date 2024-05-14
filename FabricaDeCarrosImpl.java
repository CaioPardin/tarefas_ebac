package br.com.cpardin;

public class FabricaDeCarrosImpl implements FabricaDeCarros{

    public Car createSedan() {
        return new CarroSedan();
    }

    @Override
    public Car createHatch() {
        return new CarroHatch();
    }

    @Override
    public Car createSuv() {
        return new CarroSuv();
    }
}
