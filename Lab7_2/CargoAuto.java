package com.company;

public interface CargoAuto {
    public void cargoIn(String cargo);
    public void cargoOut(String cargo);
    public void moveTo(String destination, int distance);
}
