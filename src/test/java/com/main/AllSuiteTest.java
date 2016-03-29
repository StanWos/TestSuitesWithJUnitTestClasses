package com.main;

import categories.All;
import features.TodosE2ETest;
import features.TodosOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by stan on 29.03.16.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({TodosE2ETest.class, TodosOperationsAtAllFilterTest.class})
@Categories.IncludeCategory(All.class)
public class AllSuiteTest {
}
