package com.main;

import categories.Buggy;
import categories.Smoke;
import features.TodosE2ETest;
import features.TodosOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Categories.class) /* это способ указать, каким способом запускать junit тесты, то бишь запускать тесты по категориям */
@Suite.SuiteClasses({TodosE2ETest.class, TodosOperationsAtAllFilterTest.class}) /* далее указываем в каких тест классах мы будем искать эти категории */
@Categories.IncludeCategory(Smoke.class)
@Categories.ExcludeCategory(Buggy.class) /* и тут указываем, какие именно категории включить или исключить */
public class SmokeSuiteTest {
}
