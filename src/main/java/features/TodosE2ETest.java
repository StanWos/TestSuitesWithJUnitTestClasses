package features;

import categories.All;
import categories.Smoke;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static pages.TodoMVC.*;

@Category(All.class)
public class TodosE2ETest {

    @BeforeClass
    public static void setup(){
        Configuration.browser = System.getProperty("driver.browser");
    }

    @Test
    @Category(Smoke.class) //Annotation for specifying test suite, in the brackets we specify the group
    public void testTaskLifeCycle() {

        givenAtAll();
        add("1");
        startEdit("1", "1 edited").pressEnter();
        assertTasks("1 edited");

        filterActive();
        assertTasks("1 edited");
        toggleAll();
        add("2");
        assertVisibleTasks("2");

        filterCompleted();
        assertVisibleTasks("1 edited");
        clearCompleted();
        assertNoVisibleTasks();

        filterAll();
        assertItemLeft(1);
        assertTasks("2");

        delete("2");
        assertNoTasks();

    }

}