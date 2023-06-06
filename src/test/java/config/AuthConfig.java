package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:/tmp/secret.properties",
        "classpath:properties/auth.properties"
})

public interface AuthConfig extends Config {

    @Config.Key("username")
    String remote_username();

    @Config.Key("password")
    String remote_password();
}
