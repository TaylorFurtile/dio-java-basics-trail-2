package com.acme.start;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws InterruptedException {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
            System.out.println(exception + " O segundo parâmetro deve ser maior que o primeiro.");
		}
	}

    /**
     * @throws ParametrosInvalidosException O parâmetroUm é maior que o parâmetroDois
     * @throws InterruptedException 
     */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException, InterruptedException {
		if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;

		//realizar o for para imprimir os números com base na variável contagem

        System.out.println("inicio da contagem:\n");

        for (int i = 1; i <= contagem; i++) {
            System.out.printf("%d segundo(s)\n", i);
            Thread.sleep(1000);
        }

        System.out.println("\nFim da contagem.");
	}
}
