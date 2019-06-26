package co.com.designpatterns.structural.bridge;

public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("is Red");
    }
}
