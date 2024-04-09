/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;
public class FiguraGeometrica {
    private String cor;

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
    public double getArea(){
        return 0;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
   
    public void leitura() {
        setCor(JOptionPane.showInputDialog("Digite a cor: "));
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null, "a cor é " + getCor());
    }
    public String paraString(){
    return ("cor: " +  getCor());
    }
}
