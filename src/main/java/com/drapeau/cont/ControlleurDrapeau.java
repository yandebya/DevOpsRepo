package com.drapeau.cont;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drapeau.Dao.CouleurRepository;
import com.drapeau.Dao.DrapeauRepository;
import com.drapeau.Metier.DrapeauMetier;
import com.drapeau.clsse.EntiteCouleur;
import com.drapeau.clsse.EntiteDrapeau;

@Controller
public class ControlleurDrapeau {

	@RequestMapping(value="/drapo")
	public String drapeaux(Model model) {
		model.addAttribute("sms", "salut tout le monde");
		return "listeD";
	}

	@Autowired
	private DrapeauRepository dr;
	@Autowired
	private CouleurRepository cr;
	@Autowired
	private DrapeauMetier dm;
	
	@RequestMapping(value="creationDr", method = RequestMethod.POST)
	public String creationD(EntiteDrapeau d,EntiteCouleur ec, Long id_coul, Long id_dr ) {	
		
		
		
	dm.drap(d,ec,id_coul,id_dr);
	
		return "redirect:listeDr";
	}
	
	public String sve( EntiteDrapeau ed) {
		List<EntiteCouleur> liste = cr.findAll();
		if(liste !=null && liste.size()!=0) {
			for (EntiteCouleur entiteCouleur : liste) {
			//	List<String> selectedPerson = ed.getSelectedCheckBox();
			}
		}
		return "";
	}
	
	@RequestMapping(value="creerDr")
	public String creeD(Model model) {
		EntiteDrapeau ec = new EntiteDrapeau();
		model.addAttribute("drapeau", ec);
		List<EntiteCouleur> lec = cr.findAll();		
		model.addAttribute("listeCouleur",lec);
		EntiteCouleur ecc = new EntiteCouleur();
		model.addAttribute("cc", ecc);
		return "formDrapeau";
	}
	@RequestMapping(value="listeDr")
	public String liste(Model model) {
		List<EntiteDrapeau> lec = dr.findAll();		
		model.addAttribute("listeDrapeau",lec);
		
		return "listeDrapeau";
	}
}
