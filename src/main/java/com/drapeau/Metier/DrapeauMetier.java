package com.drapeau.Metier;

import com.drapeau.clsse.EntiteCouleur;
import com.drapeau.clsse.EntiteDrapeau;

public interface DrapeauMetier {
	
	//public EntiteDrapeau creerDrapeau(EntiteDrapeau ed,Long id_coul, Long id_drapo);
	public void drap(EntiteDrapeau ed,EntiteCouleur ec, Long id_c,Long id_dr);
}
