package cxp.ingest;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.xd.module.options.spi.ModuleOption;

/**
 * Created by markmo on 2/04/2016.
 */
public class SplunkSourceOptionsMetadata {

    private String host = "localhost";

    private int port = 8089;

    private String username = "admin";

    private String password = "password";

    private String owner = "owner";

    private String savedSearch;

    @NotBlank
    public String getHost() {
        return host;
    }

    @ModuleOption("the host name or IP address of the Splunk server")
    public void setHost(String host) {
        this.host = host;
    }

    @Range(min = 0, max = 65536)
    public int getPort() {
        return port;
    }

    @ModuleOption("the TCP port number of the Splunk server")
    public void setPort(int port) {
        this.port = port;
    }

    @NotBlank
    public String getUsername() {
        return username;
    }

    @ModuleOption("the login name that has rights to receive data from Splunk")
    public void setUsername(String username) {
        this.username = username;
    }

    @NotBlank
    public String getPassword() {
        return password;
    }

    @ModuleOption("the password associated with the username")
    public void setPassword(String password) {
        this.password = password;
    }

    @NotBlank
    public String getOwner() {
        return owner;
    }

    @ModuleOption("the owner of the Splunk namespace")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @NotBlank
    public String getSavedSearch() {
        return savedSearch;
    }

    @ModuleOption("the name of the saved search in Splunk")
    public void setSavedSearch(String savedSearch) {
        this.savedSearch = savedSearch;
    }
}
