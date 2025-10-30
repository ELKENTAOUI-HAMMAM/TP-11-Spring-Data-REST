package ma.rest.tp11_spring_data_rest;

import ma.rest.tp11_spring_data_rest.entities.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "clientDetails", types = Client.class)
public interface ClientProjection {
    public String getNom();
    public String getEmail();
}
