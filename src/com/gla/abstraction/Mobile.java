package com.gla.abstraction;

public interface Mobile {
    String OS = "IOS";
    String Color = "White";
    public void OS();
    public void  Color();

}
class Iphone implements Mobile{

    @Override
    public void OS() {
        System.out.println(OS);
    }

    @Override
    public void Color() {
        System.out.println(Color);
    }
}
