package wolfapi;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.*;

import wolfapi.WNModel.ILR;
import wolfapi.WNModel.LITERAL;
import wolfapi.WNModel.SYNONYM;
import wolfapi.WNModel.SYNSET;
import wolfapi.WNModel.WN;

/**
 * The main query class
 * @author sofat
 *
 */
public class WnQuery {
	private WN wn;
	// literals to synset ids
	private Map<String, List<String>> nIdx;
	private Map<String, List<String>> vIdx;
	private Map<String, List<String>> aIdx;
	private Map<String, List<String>> bIdx;
	private Map<String, Map<String, List<String>>> idxs;
	// synset ids to synsets
	private Map<String, SYNSET> ndat;
	private Map<String, SYNSET> vdat;
	private Map<String, SYNSET> adat;
	private Map<String, SYNSET> bdat;
	private Map<String, Map<String, SYNSET>> dats;
	// inversion table
	private Map<String, String> invRelTable;

	public static void main(String[] args) {
		//TODO: make it a console tool...
		WnQuery wq = new WnQuery();
		int a = 0;
		Set<SYNSET> res = wq.querySynonym("avoir");
		printSynsetCollection(res);
		res = wq.querySynonym("chiotte", "n");
		printSynsetCollection(res);

	}

	public static void printSynsetCollection(Collection<SYNSET> c) {
		if (c.isEmpty()) {
			System.out.println("SYNSET list is empty!");
			return;
		}
		for (SYNSET synset : c) {
			System.out.println(synset.toString());
		}
	}

	public WnQuery() {
		wn = getWnFromXml();
		idxs = new HashMap<String, Map<String, List<String>>>();
		nIdx = new HashMap<String, List<String>>();
		vIdx = new HashMap<String, List<String>>();
		aIdx = new HashMap<String, List<String>>();
		bIdx = new HashMap<String, List<String>>();
		idxs.put("n", nIdx);
		idxs.put("v", vIdx);
		idxs.put("a", aIdx);
		idxs.put("b", bIdx);

		dats = new HashMap<String, Map<String, SYNSET>>();
		ndat = new HashMap<String, SYNSET>();
		vdat = new HashMap<String, SYNSET>();
		adat = new HashMap<String, SYNSET>();
		bdat = new HashMap<String, SYNSET>();
		dats.put("n", ndat);
		dats.put("v", vdat);
		dats.put("a", adat);
		dats.put("b", bdat);

		storeSynSetByPOS();
		// createInvRelTable();
		indexLiteralToID();
	}

	// Create inversed relation table, could be interesting in the future
	private void createInvRelTable() {
		invRelTable = new HashMap<>();
		invRelTable.put("hypernym", "hyponym");
		invRelTable.put("holo_member", "mero_member");
		invRelTable.put("holo_part", "mero_part");
		invRelTable.put("holo_portion", "mero_portion");
		invRelTable.put("region_domain", "region_member");
		invRelTable.put("usage_domain", "usage_member");
		invRelTable.put("category_domain", "category_member");
		invRelTable.put("near_antonym", "near_antonym");
		invRelTable.put("middle", "middle");
		invRelTable.put("verb_group", "verb_group");
		invRelTable.put("similar_to", "similar_to");
		invRelTable.put("also_see", "also_see");
		invRelTable.put("be_in_state", "be_in_state");
		invRelTable.put("eng_derivative", "eng_derivative");
		invRelTable.put("is_consequent_state_of", "has_consequent_state");
		invRelTable.put("is_preparatory_phase_of", "has_preparatory_phase");
		invRelTable.put("is_telos_of", "has_telos");
		invRelTable.put("subevent", "has_subevent");
		invRelTable.put("causes", "caused_by");
	}

	public void indexLiteralToID() {
		for (SYNSET synset : wn.getSYNSET()) {
			List<LITERAL> literals = synset.getSYNONYM().getLITERAL();
			Map<String, List<String>> idx = idxs.get(synset.getPOS());
			String synsetID = synset.getID();
			for (LITERAL literal : literals) {
				String literalvValue = literal.getvalue();
				if (literalvValue != null && !literalvValue.equalsIgnoreCase("_EMPTY_")) {
					if (!idx.containsKey(literalvValue)) {
						List<String> idList = new ArrayList<>();
						idx.put(literalvValue, idList);
					}
					idx.get(literalvValue).add(synsetID);

				}
			}
		}
	}

	public void storeSynSetByPOS() {
		for (SYNSET syns : wn.getSYNSET()) {
			// try {
			dats.get(syns.getPOS()).put(syns.getID(), syns);
			// } catch (NullPointerException e) {
			// System.out.println(syns.toString());
			// }
		}
	}

	public void invRelPos(Map<String, SYNSET> dat) {
		for (Map.Entry<String, SYNSET> entry : dat.entrySet()) {
			SYNSET synset = entry.getValue();
			for (ILR ilr : synset.getILR()) {
				// todo:
			}
		}
	}

	public Set<SYNSET> querySynonym(String word, String pos) {
		Set<SYNSET> synonyms = new HashSet<>();
		List<String> ids = idxs.get(pos).get(word);
		if (ids != null) {
			for (String id : ids) {
				synonyms.add(dats.get(pos).get(id));
			}
		}
		return synonyms;
	}

	public Set<SYNSET> querySynonym(String word) {
		Set<SYNSET> synonyms = new HashSet<>();
		for (String pos : idxs.keySet()) {
			synonyms.addAll(querySynonym(word, pos));
		}
		return synonyms;
	}

	public WN getWnFromXml() {
		try {
			JAXBContext jc = JAXBContext.newInstance("wolfapi.WNModel");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			WN wn = (WN) unmarshaller.unmarshal(new File("wolf-1.0b4.xml"));
			return wn;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
