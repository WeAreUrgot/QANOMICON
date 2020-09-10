package baseEntity;


import core.BrowsersService;
import core.ReadProperties;
import org.testng.annotations.*;
import utils.Listener;

@Listeners(Listener.class)
public abstract class BaseTest {
    public BrowsersService browsersService;
    public ReadProperties properties;


}