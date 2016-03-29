package com.main;

import categories.Buggy;
import features.TodosOperationsAtAllFilterTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by stan on 29.03.16.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses(TodosOperationsAtAllFilterTest.class)
@Categories.IncludeCategory(Buggy.class)
public class BuggySuiteTest {
}
