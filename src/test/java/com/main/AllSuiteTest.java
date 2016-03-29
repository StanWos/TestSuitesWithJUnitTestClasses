package com.main;

import com.main.features.TodosE2ETest;
import com.main.features.TodosOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by stan on 29.03.16.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({TodosE2ETest.class, TodosOperationsAtAllFilterTest.class})
public class AllSuiteTest {
}
