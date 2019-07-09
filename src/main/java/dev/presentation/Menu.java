package dev.presentation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Menu {
	private Map<Integer, OptionIhm> options = new HashMap<>();
	private Scanner scan = new Scanner(System.in);

	@Autowired
	private ListerChocolatine listerChocolatine;
	
	@Autowired
	private CreerChocolatine creerChocolatine;

	@Autowired
	private CreerCommande creerCommande;

	public Menu() {
	}

	@PostConstruct
	public void init() {
		options.put(1, listerChocolatine);
		options.put(2, creerChocolatine);
		options.put(3, creerCommande);
	}

	public Map<Integer, OptionIhm> getOptions() {
		return options;
	}

	public void setOptions(Map<Integer, OptionIhm> options) {
		this.options = options;
	}

	public void demarrer() {
		int option = 0;
		do {
			System.out.println("###############MENU####################");
			options.forEach((i, o) -> {
				System.out.println(i.toString() + ": " + o.getLibelle());
			});
			option = scan.nextInt();
			if (options.containsKey(option)) {
				options.get(option).executer();
			} else
				System.out.println("Choix incorrecte");
		} while (option != 10);
		scan.close();
	}
}
