package ma.rest.tp11_spring_data_rest.entities;

import ma.rest.tp11_spring_data_rest.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Compte.class)
public interface CompteProjection2 {
    double getSolde();
    TypeCompte getType();
}
