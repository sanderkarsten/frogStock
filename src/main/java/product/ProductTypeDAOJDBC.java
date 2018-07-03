package product;

import connection.JDBCDAO;
import connection.JdbcConnectionFactory;

import javax.inject.Inject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ProductTypeDAOJDBC extends JDBCDAO implements ProductTypeDAO {
    private static Logger logger = Logger.getLogger(ProductTypeDAOJDBC.class.getName());

    @Inject
    public ProductTypeDAOJDBC(JdbcConnectionFactory jdbcConnectionFactory) {
        super(jdbcConnectionFactory);
    }

    @Override
    public List<ProductType> list() {
        String sql = "select product_type.name as productName, product_type.description as productDescription, brand.description as brandDescription, brand.name as brand, alcoholpercentage  from product_type inner join brand on product_type.brand = brand.idbrand";
        List<ProductType> productList = new ArrayList<ProductType>();
        Connection connection = jdbcConnectionFactory.create();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductType productType = castResultSetToObject(resultSet);
                productList.add(productType);
            }
            connection.close();
        } catch (SQLException e) {
            logger.severe(e.getMessage());
        }
        return productList;
    }

    private ProductType castResultSetToObject(ResultSet resultSet) {
        try {
            return new ProductType(
                    resultSet.getString("productName"),
                    resultSet.getString("productDescription"),
                    resultSet.getString("brand"),
                    resultSet.getString("brandDescription"),
                    resultSet.getInt("alcoholPercentage")
            );
        } catch (SQLException e) {
            logger.severe(e.getMessage());
        }
        return null;
    }
}
