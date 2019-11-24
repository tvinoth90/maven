package vinoth-web;

import org.linkki.framework.state.ApplicationConfig;
import org.linkki.framework.ui.application.ApplicationFooter;
import org.linkki.framework.ui.application.ApplicationHeader;
import org.linkki.framework.ui.application.menu.ApplicationMenuItemDefinition;
import org.linkki.util.Sequence;


/**
 * An {@link ApplicationConfig} using the default {@link ApplicationHeader application header} and
 * {@link ApplicationFooter application footer}.
 */
public class vktwebsiteApplicationConfig implements ApplicationConfig {


    @Override
    public String getApplicationName() {
        return "vktwebsite Sample Application";
    }

    @Override
    public String getApplicationVersion() {
        return "0.0.1-SNAPSHOT";
    }

    @Override
    public String getApplicationDescription() {
        return "vktwebsite Sample Application";

    }

    @Override
    public String getCopyright() {
        return "";
    }

    @Override
    public Sequence<ApplicationMenuItemDefinition> getMenuItemDefinitions() {
        return Sequence.empty();
    }

}
