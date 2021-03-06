package org.sav.jaxws.test;

import junit.framework.Assert;
import org.glassfish.embeddable.GlassFish;
import org.glassfish.embeddable.GlassFishException;
import org.glassfish.embeddable.GlassFishRuntime;
import org.glassfish.embeddable.archive.ScatteredArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sav.jaxws.OrgsynchService;
import org.sav.jaxws.OrgsynchService_Service;

import javax.xml.ws.Holder;
import java.io.File;
import java.io.IOException;

/**
 * @author tolya
 * @since 07.02.14.
 */

public class testMethodTest {

    protected GlassFish glassFish;
    protected String deployedApp;

    @Before
    public void beforeTest() throws GlassFishException, IOException {
        GlassFishRuntime runtime = GlassFishRuntime.bootstrap();
        glassFish = runtime.newGlassFish();
        glassFish.start();
        glassFish.getCommandRunner().run("create-http-listener",
                                         "--listeneraddress", "localhost",
                                         "--listenerport", "8080",
                                         "--default-virtual-server", "server",
                                         "--securityenabled", "false",
                                         "listener0");
        ScatteredArchive archive = new ScatteredArchive("jaxws", ScatteredArchive.Type.WAR);
        archive.addClassPath(new File("target/classes"));
        archive.addMetadata(new File("src/main/webapp/WEB-INF", "web.xml"));
        archive.addMetadata(new File("src/main/webapp/WEB-INF", "sun-jaxws.xml"));
        deployedApp = glassFish.getDeployer().deploy(archive.toURI(), "--contextroot=jaxws", "--force=true");
    }

    @Test
    public void testMethod() throws Exception {
        OrgsynchService service = new OrgsynchService_Service().getOrgsynchService();
        Holder<String> arg = new Holder<>("test");
        service.testMethod(arg);
        Assert.assertEquals(arg.value, "test success");
    }

    @After
    public void afterTest() throws GlassFishException {
        glassFish.getDeployer().undeploy(deployedApp);
        glassFish.stop();
        glassFish.dispose();
    }
}
