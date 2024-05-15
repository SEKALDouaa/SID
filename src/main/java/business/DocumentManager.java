package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import beans.Documentb;
import dao.DocumentDao;
import dao.DocumentDaoImpl;

public class DocumentManager implements DocumentBuisness {
	private DocumentDao dd;
	
	public DocumentManager() {
	}

	public DocumentManager(DocumentDaoImpl dd) {
		this.dd = dd;
	}
	
	public void addDocument(Documentb document) {
		dd.insertDocument(document);
	}

	public List<Documentb> getDocumentByAuteur(String Auteur) {
		return dd.selectDocumentByAuteur(Auteur);
	}

	public List<Documentb> getDocumentByGenre(String genre) {
		return dd.selectDocumentByGenre(genre);
	}

	public List<Documentb> getDocumentByTitre(String titre) {
		return dd.selectDocumentByTitre(titre);
	}

	public List<Documentb> getDocumentByCode(int code) {
		return dd.selectDocumentByCode(code);
	}

	public List<Documentb> getDocumentByVersion(int version) {
		return dd.selectDocumentByVersion(version);
	}

	public List<Documentb> getDocumentByVisibilite(String visibilite) {
		return dd.selectDocumentByVisibilite(visibilite);
	}

	public List<Documentb> getDocumentByDepartement(String departement) {
	return dd.selectDocumentByDepartement(departement);
	}
	
	private boolean containsDocumentWithCode(Map<Documentb, Integer> documentMap, int Code) {
        for (Documentb document : documentMap.keySet()) {
            int code = document.getCode();
            if (code == Code) {
                return true;
            }
        }
        return false;
    }
	
	private Documentb containsDocumentWithCode2(Map<Documentb, Integer> documentMap, int Code) {
        for (Documentb document : documentMap.keySet()) {
            int code = document.getCode();
            if (code == Code) {
                return document;
            }
        }
        return null;
    }
	
	public List<Documentb> getLatestVersions() {
	    Map<Documentb, Integer> latestVersionsMap = new HashMap<>();

	    List<Documentb> l =dd.selectAllDocuments();

	    for (Documentb document : l) {
	        int version = document.getVersion();
	        if (!containsDocumentWithCode(latestVersionsMap,document.getCode())) {
	            latestVersionsMap.put(document, version);
	        }
	        else if (version>containsDocumentWithCode2(latestVersionsMap,document.getCode()).getVersion()){
	        	latestVersionsMap.remove(containsDocumentWithCode2(latestVersionsMap,document.getCode()));
	        	latestVersionsMap.put(document, version);
	        }
	    }

	    List<Documentb> latestVersionsList = new ArrayList<>(latestVersionsMap.keySet());

	    return latestVersionsList;
	}
	
	public List<Documentb> getLatestVersionsDept(String dept){
		List<Documentb> ld=getLatestVersions();
		List<Documentb> l=new ArrayList<>();
		for(Documentb d: ld) {
			if(d.getDepartement().equals(dept)) {
				l.add(d);
			}
		}
		return l;
	}
	
	public List<Documentb> getDocContainingString(String titre) {
		List<Documentb> ld=dd.selectAllDocuments();
		for(Documentb doc1 :ld) {
			System.out.println(doc1.toString());
		}
		List<Documentb> l=new ArrayList<>();
		for(Documentb d: ld) {
			if(d.getTitre().contains(titre)) {
				l.add(d);
			}
		}
		return l;
	}
	
	public List<Documentb> getDocContainingStringDept(String titre,String dept) {
		List<Documentb> ld=dd.selectDocumentByDepartement(dept);
		for(Documentb doc1 :ld) {
			System.out.println(doc1.toString());
		}
		List<Documentb> l=new ArrayList<>();
		for(Documentb d: ld) {
			if(d.getTitre().contains(titre)) {
				l.add(d);
			}
		}
		return l;
	}
	
	public List<Documentb> getDocContainingStringDeptV(String titre,String dept) {
		List<Documentb> ld=getLatestVersionsDept(dept);
		for(Documentb doc1 :ld) {
			System.out.println(doc1.toString());
		}
		List<Documentb> l=new ArrayList<>();
		for(Documentb d: ld) {
			if(d.getTitre().contains(titre)) {
				l.add(d);
			}
		}
		return l;
	}

	public List<Documentb> getAllDocuments() {
		return dd.selectAllDocuments();
	}

	public void updateDocument(Documentb document) {
		dd.updateDocument(document);
	}

	public void deleteDocumentByCode(int code) {
		dd.deleteDocumentByCode(code);
	}

}
