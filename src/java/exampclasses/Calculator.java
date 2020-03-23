package exampclasses;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NURDAN
 */
@ManagedBean
@SessionScoped
public class Calculator {
    private int first;
    private int second;
    private int output;
    private String info;

    /**
     * @return the first
     */
    public int getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * @return the second
     */
    public int getSecond() {
        return second;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(int second) {
        this.second = second;
    }
    
    

    /**
     * @return the output
     */
    public int getOutput() {
        return output;
    }

    /**
     * @param output the output to set
     */
    public void setOutput(int output) {
        this.output = output;
    }
    
    public void add(){
        this.setOutput(this.first + this.second);
        this.info="Toplama İşlemi";
    }
    
    public void substract(){
        this.setOutput(this.first - this.second);
        this.info="Çıkarma İşlemi";
    }
    
    public void multiply(){
        this.setOutput(this.first * this.second);
        this.info="Çarpma İşlemi";
    }
    
    public void division(){
        this.setOutput(this.first / this.second);
        this.info="Bölme İşlemi";
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }
    
}
