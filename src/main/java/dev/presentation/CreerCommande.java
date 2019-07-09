package dev.presentation;

import dev.entite.Chocolatine;
import dev.service.ChocolatineService;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CreerCommande extends Option implements OptionIhm {
	@Autowired
	private ChocolatineService chocolatineService;

	public CreerCommande() {
		super("Creér une commande");
	}

	@Override
	public void executer() {
		List<Chocolatine> chocolatineMap = chocolatineService.listerChocolatine();
		chocolatineMap.forEach((c) -> {
			System.out.println(c.getId() + ": " + c);
		});

	}
}
