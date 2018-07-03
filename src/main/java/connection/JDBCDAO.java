package connection;

public class JDBCDAO {
    protected JdbcConnectionFactory jdbcConnectionFactory;

    public JDBCDAO(JdbcConnectionFactory jdbcConnectionFactory) {
        this.jdbcConnectionFactory = jdbcConnectionFactory;
    }
}
