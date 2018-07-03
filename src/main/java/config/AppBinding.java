package config;

import com.google.inject.servlet.ServletModule;
import product.ProductTypeDAO;
import product.ProductTypeDAOJDBC;
import rest.ProductService;
import rest.ProductServiceREST;

public class AppBinding extends ServletModule {
    @Override
    protected void configureServlets() {
        super.configureServlets();
        bind(ProductService.class).to(ProductServiceREST.class);
        bind(ProductTypeDAO.class).to(ProductTypeDAOJDBC.class);
    }
}
