/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrofunc;

/**
 *
 * @author Leandro
 */
public final class Funcionario implements Comparable<Funcionario>{
    private final String nome;
    private final double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(){
        this("Sem nome", 0.0);
    }
    public String getNome(){
        return this.nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public int compareTo(Funcionario outro){
        return Double.compare(this.salario, outro.salario);
        
    }
    
    public double calcularBonus(){
        if(salario >= 3000){
            return  10;
        }else{

            return 5;
        }
    }
    public double totalSalario(){
        double bonus = calcularBonus();
        if (bonus == 10){
            return this.salario*1.10;
        }else{
            return this.salario*1.05;
        }
    }

       
    }
    

