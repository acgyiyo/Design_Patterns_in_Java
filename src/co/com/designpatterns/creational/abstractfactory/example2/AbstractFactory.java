package co.com.designpatterns.creational.abstractfactory.example2;

public interface AbstractFactory<T> {
  T create(String type);
}
