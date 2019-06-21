package co.com.designpatterns.creational.builder;

/**
 * clase creada con el patron builder
 */
public class LaunchOrder {
    //sin finales ya que se quiere crear una clase inmutable
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    //privado para conservar su inmutabilidad
    private LaunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    //este patron cuenta con una inner class estatica que nos permite construir el objeto y que siga siendo inmutable
    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {
        }
        //este método construye el objeto
        public LaunchOrder build() {
            return new LaunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }
}
