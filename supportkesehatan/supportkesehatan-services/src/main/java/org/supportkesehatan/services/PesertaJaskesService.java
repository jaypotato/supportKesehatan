
package org.supportkesehatan.services;

import java.util.List;


import org.supportkesehatan.domain.PesertaJaskes;

public interface PesertaJaskesService {
	
	List<PesertaJaskes> list();
	void createAccount(PesertaJaskes newPesJaskes);
}
