/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.*;
public class Circulo extends FiguraGeometrica {

    private double raio;

    public Circulo() {
        this("", 0);
    }

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void setRaio(String raio) {
        this.raio = Double.parseDouble(raio);
    }

    @Override
    public void leitura() {
        super.leitura();
        setRaio(JOptionPane.showInputDialog("Digite o raio"));
    }

    
    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "O raio é " + getRaio());
    }
        
    /**
     *
     * @return
     */
    @Override
    public double getArea(){
        return (3.14 * (raio*raio));
        }
}
