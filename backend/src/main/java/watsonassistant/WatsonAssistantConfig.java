package watsonassistant;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Configuration
@ConfigurationProperties(prefix = "ibm.watson.assistant")
@Validated // Validación de la configuración
public class WatsonAssistantConfig {

    private String apikey="TO9VdomJoalU-hzSzXPCWzH6r4pzk1c51MkYLKAk1ZpU";

    @NotNull(message = "ID is required")
    @NotBlank(message = "ID is required")
    @Pattern(regexp = "[a-z-A-Z0-9-]*", message = "ID is not valid")
    private String id="ecd8c997-231b-4b14-b829-262b5fc5c051";

    @NotNull(message = "Wrong URL")
    @NotBlank(message = "Wrong URL")
    @Pattern(
            regexp = "https:\\/\\/(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_\\+.~#?&\\/\\/=]*)",
            message = "Wrong URL"
    )
    private String url="https://api.us-south.assistant.watson.cloud.ibm.com/instances/6501edc4-6c37-4368-9319-106737b88ddf";

    @NotNull(message = "Version date error")
    @NotBlank(message = "Version date error")
    @Pattern(
            regexp = "^\\d{4}(-)(((0)[0-9])|((1)[0-2]))(-)([0-2][0-9]|(3)[0-1])$",
            message = "The version date contains errors, it must be in the format YYYY-MM-DD"
    )
    private String versionDate="2020-01-16";


    // Getters
    public String getApikey() {
        return apikey;
    }
    public String getId() {
        return id;
    }
    public String getUrl() {
        return url;
    }
    public String getVersionDate() {
        return versionDate;
    }
    // Setters
    public void setApikey(String apikey) { this.apikey = apikey; }
    public void setId(String id) { this.id = id; }
    public void setUrl(String url) { this.url = url; }
    public void setVersionDate(String versionDate) {
        this.versionDate = versionDate;
    }
}
