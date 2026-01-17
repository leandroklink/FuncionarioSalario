/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrofunc;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FuncionarioTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<>();
        Collections.sort(arrayFuncionario);
        double soma = 0, media;
        
        for(int i=1;i<=3;i++){
            System.out.printf("Digite o nome do %d Funcionário: \n", i);
            String nome = input.nextLine();
            
            System.out.printf("Digite o salário do %d Funcionário: \n", i);
            double salario = input.nextDouble();
            input.nextLine();
            
            Funcionario funcionario = new Funcionario(nome, salario);

            arrayFuncionario.add(funcionario); 

        }

        System.out.println("====== Lista de Funcionários (ordenado por salário)======");
        for (Funcionario f : arrayFuncionario){ 
                        soma += f.getSalario();
            
            System.out.printf("""
                              Nome: %s
                              Salario: %.2f
                              Bonus: %.0f%%
                              Salario total: %.2f\n
                              """, f.getNome(), f.getSalario(), f.calcularBonus(),f.totalSalario());
            
        }
        media = soma/arrayFuncionario.size();
        System.out.printf("Média Salárial: %.2f", media);
        }
    }

