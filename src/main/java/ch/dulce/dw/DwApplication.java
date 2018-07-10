package ch.dulce.dw;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DwApplication extends Application<DwConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DwApplication().run(args);
    }

    @Override
    public String getName() {
        return "Dw";
    }

    @Override
    public void initialize(final Bootstrap<DwConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DwConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
