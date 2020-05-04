package com.drapeau.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drapeau.Dao.CouleurRepository;
import com.drapeau.clsse.EntiteCouleur;

@Controller
public class ControlleurCouleur {
	
	@Autowired
	private CouleurRepository cr;
	
	@RequestMapping(value="creationCoul", method = RequestMethod.POST)
	public String creationC(EntiteCouleur c) {	
		cr.save(c);
		return "redirect:listeCoul";
	}
	
	@RequestMapping(value="creerCoul")
	public String creeC(Model model) {
		EntiteCouleur ec = new EntiteCouleur();
		model.addAttribute("couleur", ec);
		return "formCouleur";
	}
	@RequestMapping(value="listeCoul")
	public String liste(Model model) {
		List<EntiteCouleur> lec = cr.findAll();		
		model.addAttribute("listeCouleur",lec);
		
		return "listeCouleur";
	}

}
