package org.reservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.reservation.common.Material;



public class MaterialDaoImpl implements MaterialDao {
	
	
	public static List<Material> materials =new ArrayList<Material>();
	
    static {
    	materials.add(new Material(2, new String("Ordinateur"), new String("DELL"), new String("1111APP000011")));
    	materials.add(new Material(3, new String("Ordinateur"), new String("hp"), new String("2111APP0000125")));
    	materials.add(new Material(1, new String("Vidéo projecteur"), new String("Samsung"), new String("1111APP033")));
    }
	

	public List<Material> findAll() {
		return materials;
	}

	public Material findById(int id) {
		
		for(Material material :materials) {
			if(material.getId()==id)
		return material;
		}
		return null;
	}

	public Material save(Material material) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
