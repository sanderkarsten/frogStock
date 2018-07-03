package config;

import org.glassfish.hk2.api.ServiceLocator;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest")
public class RestResourceConfig extends GuiceResourceConfig {
    @Inject
    public RestResourceConfig(ServiceLocator serviceLocator) {
        packages(true, "rest");
        property(JSON_SERIALIZER, JACKSON_JSON_SERIALIZER);
        registerGuiceBinding(serviceLocator, new AppBinding());
    }
}

