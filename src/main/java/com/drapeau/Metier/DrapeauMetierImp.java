package com.drapeau.Metier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.hibernate.mapping.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drapeau.Dao.CouleurRepository;
import com.drapeau.Dao.DrapeauRepository;
import com.drapeau.clsse.EntiteCouleur;
import com.drapeau.clsse.EntiteDrapeau;

@Service
public class DrapeauMetierImp implements DrapeauMetier{

	
	@Autowired
	private CouleurRepository cr;
	
	@Autowired
	private DrapeauRepository dr;
	
	@Override
	public void drap(EntiteDrapeau ed,EntiteCouleur ec, Long id_c,Long id_dr) {	
			
		EntiteCouleur clr = cr.getOne(id_c);
		
		ed.setCouleur(new HashSet<EntiteCouleur> (Arrays.asList(clr)));
		dr.save(ed);
		
		
		
		/*
		 * for (EntiteCouleur iterable_element : Arrays.asList(clr)) { ed.setCouleur(new
		 * HashSet<EntiteCouleur> (Arrays.asList(iterable_element))); dr.save(ed); }
		 */
		
	}
	
	
	
	/*@Override
	public EntiteDrapeau creerDrapeau(EntiteDrapeau ed, Long id_coul,Long id_drapo) { 
		return drap(id_coul,id_drapo);
			
		
	}*/
	

}
