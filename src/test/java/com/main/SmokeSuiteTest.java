package com.main;

import com.main.categories.Smoke;
import com.main.features.TodosE2ETest;
import com.main.features.TodosOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class) /* это способ указать, каким способом запускать junit тесты, то бишь запускать тесты по категориям */
@Suite.SuiteClasses({TodosE2ETest.class, TodosOperationsAtAllFilterTest.class}) /* далее указываем в каких тест классах мы будем искать эти категории */
@Categories.IncludeCategory(Smoke.class) /* и тут указываем, какие именно категории включить или исключить */
public class SmokeSuiteTest {
}
