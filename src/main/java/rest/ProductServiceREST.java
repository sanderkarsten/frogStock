package rest;

import product.ProductTypeDAO;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Path("product")
public class ProductServiceREST implements ProductService {
    private static Logger logger = Logger.getLogger(ProductServiceREST.class.getName());

    @Inject
    private ProductTypeDAO productTypeDAO;

    @GET
    @Override
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getProducts() {
        return Response.ok(productTypeDAO.list()).build();
    }
}
