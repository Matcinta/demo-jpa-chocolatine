package dev.presentation;

import dev.entite.Chocolatine;
import dev.service.ChocolatineService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ListerChocolatine extends Option implements OptionIhm {
    
	@Autowired
	private ChocolatineService chocolatineService;

    public ListerChocolatine() {
        super("Lister chocolatine");
    }

    @Override
    public void executer() {
        List<Chocolatine> chocolatines = chocolatineService.listerChocolatine();
        chocolatines.forEach((choco)-> System.out.println(choco.getId()+":"+choco));
    }
}
