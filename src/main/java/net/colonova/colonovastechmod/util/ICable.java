package net.colonova.colonovastechmod.util;

public interface ICable
{
    boolean canInput();
    boolean canExtract();
    int minInput();
    int maxInput();
    int minExtract();
    int maxExtract();

    CableType getCableType();
    MachineType getMachineType();
}
