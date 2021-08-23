package fr.htc.test;

import java.util.ArrayList;

public class RunIt {

	public static void main(String[] args) {

List<String> arguments = new ArrayList<>();
		for (String arg : args) {
			if (arg.length() > 3) {
				arguments.add(arg);
			}
		}

		System.out.println("LE nombre d'arguments de taille > à 3 est " + arguments.size());
		System.out.println("Voici la list :");
		for (String argSup3 : arguments) {
			System.out.println(argSup3);
		}
	}
}