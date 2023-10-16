package model.entities;

/**
 *
 * @author kakah
 */
public class Veiculo {

    private String model;

    public Veiculo() {
    }

    public Veiculo(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}