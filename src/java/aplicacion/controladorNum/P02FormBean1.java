/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controladorNum;



import aplicacion.modeloNum.Numero1;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author sandra
 */
@ManagedBean
@ViewScoped
public class P02FormBean1 implements Serializable {
    private Numero1 unNumero;
    private ArrayList<Integer> arreglo;;
    private int n;
    private int max;
    private int min;
    private double prom;
    

   
    public P02FormBean1() {
        unNumero=new Numero1();
        arreglo = new ArrayList();
         //i = 0 ;
    }
    
    public void recibirN(){      
                arreglo.add(n);
    }
    
    public void calcular(){
        int max1=0;
        int min1=arreglo.get(0);
        double sum=0;
        double promi; 
      for(int i=0;i<arreglo.size();i++){
        if (max1<arreglo.get(i)){
         max1=arreglo.get(i);
        }
    
        if (min1>arreglo.get(i)){
         min1=arreglo.get(i);
        }
      }                     
      for(int j=0;j<arreglo.size();j++){
         sum=sum+arreglo.get(j);  
      }                
       promi=sum/arreglo.size();
      
        max=max1;
        min=min1;
        prom=promi;
    }
  

    public int getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * @return the unNumero
     */
    public Numero1 getUnNumero() {
        return unNumero;
    }

    /**
     * @param unNumero the unNumero to set
     */
    public void setUnNumero(Numero1 unNumero) {
        this.unNumero = unNumero;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * @return the prom
     */
    public double getProm() {
        return prom;
    }

    /**
     * @param prom the prom to set
     */
    public void setProm(double prom) {
        this.prom = prom;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the arreglo
     */
    public ArrayList<Integer> getArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(ArrayList<Integer> arreglo) {
        this.arreglo = arreglo;
    }

}
