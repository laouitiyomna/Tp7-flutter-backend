package org.isetn;

import java.util.Date;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = Etudiant.class)
public interface EtudiantProjection {
	Long getId();
	String getNom();
	String getPrenom();
	Date getDateNais();
}